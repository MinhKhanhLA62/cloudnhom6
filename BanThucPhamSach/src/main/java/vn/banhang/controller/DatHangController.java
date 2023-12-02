package vn.banhang.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.banhang.sendmail.SendMail;
import vn.banhang.dao.DatHangDAO;
import vn.banhang.model.AccountModel;
import vn.banhang.model.ChiTietDonHangModel;

/**
 * Servlet implementation class DatHangController
 */
@WebServlet("/dat-hang")
public class DatHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		AccountModel acc = (AccountModel) session.getAttribute("account");
		String SoDT = acc.getUsername();
		String email = request.getParameter("email");
		String hoTen = request.getParameter("hoten");
		String SoDTNhanHang = request.getParameter("sdt");
		String diaChi = request.getParameter("diachi");
		String ghiChu = request.getParameter("ghichu");
		
		
		DatHangDAO dathangDao = new DatHangDAO();
		String maDon = dathangDao.ThemDonHang(SoDT);
		
		List<ChiTietDonHangModel> listChiTiet = new ArrayList<ChiTietDonHangModel>();
		Map<String, ChiTietDonHangModel> map = (Map<String, ChiTietDonHangModel>) session.getAttribute("cart");
		for(String key : map.keySet()) {
			listChiTiet.add(map.get(key));
		}
		dathangDao.ThemChiTietDonHang(maDon, listChiTiet);
		String ChiTietDonHang = "";
		double tamtinh = 0;
		for(ChiTietDonHangModel chitiet : listChiTiet) {
			ChiTietDonHang+= chitiet.getMaSP().getTenSP().toString()
					+ " - Số lượng: " + String.valueOf(chitiet.getSoLuong())
					+ " - Giá tiền: " + String.valueOf(chitiet.getGiaTien()) + "\n";
			tamtinh+= chitiet.getSoLuong()*chitiet.getGiaTien();
		}
		double vat = tamtinh*10/100;
		double tongtien = tamtinh + vat;
		String title = "Auto email from DBQ fresh food";
		String html = "<!DOCTYPE html>\r\n"
				+ "<html lang =" +"vi" + ">\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Auto email from DBQ Fresh food</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<p>Order Success</p>\r\n"
				+ "<p>" + ChiTietDonHang + "</p>"
				+ "<p> VAT: " + String.valueOf(vat) + "</p>\r\n"
				+ "<p> Total: " + String.valueOf(tongtien) + "</p>"
				+ "<p> Name: " + hoTen + "</p>\r\n"
				+ "<p> Phone: " + SoDTNhanHang + "</p>\r\n"
				+ "<p> Address: " + diaChi + "</p>\r\n"
				+ "<p> Note: " + ghiChu + "</p>\r\n"
				+ "<p>Thank you for choosing to shop at DBQ fresh food</p>\r\n"
				+ "<p>If there are complaints, please feedback to nhom09@gmail.com</p>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		if(email!=null) {
			SendMail.sendMail(email, title, html);
		}
		
		RequestDispatcher rq= request.getRequestDispatcher("/index.jsp");
		rq.forward(request, response);
		
	}

}
