package vn.banhang.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.banhang.dao.MaGiamGiaDAO;
import vn.banhang.dao.SanPhamDAO;
import vn.banhang.model.ChiTietDonHangModel;
import vn.banhang.model.MaGiamGiaModel;
import vn.banhang.model.SanPhamModel;

/**
 * Servlet implementation class ThemVaoGioHangController
 */
@WebServlet("/them-vao-gio")
public class ThemVaoGioHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String maSP=req.getParameter("maSP");
		String soLuongSP=req.getParameter("soLuong");
		
		SanPhamDAO productDao = new SanPhamDAO();
		SanPhamModel sanPham=productDao.getOneSanPham(maSP);
		
		ChiTietDonHangModel chiTietDH=new ChiTietDonHangModel();
		chiTietDH.setGiaTien(sanPham.getGiaDaGiam());
		chiTietDH.setMaSP(sanPham);
		chiTietDH.setSoLuong(Integer.parseInt(soLuongSP));
		
//		Tạo Ses lưu giỏ hàng
		HttpSession httpSession= req.getSession();
		Object obj= httpSession.getAttribute("cart");
		
		if(obj==null) {
			Map<String, ChiTietDonHangModel> map=new HashMap<String, ChiTietDonHangModel>();
			map.put(chiTietDH.getMaSP().getMaSP(), chiTietDH);
			httpSession.setAttribute("cart", map);
		}
		else {
			Map<String, ChiTietDonHangModel> map = extracted(obj);
			ChiTietDonHangModel exised=map.get(String.valueOf(maSP));
			if(exised==null) {
				map.put(sanPham.getMaSP(), chiTietDH);
			}
			else {
				exised.setSoLuong(exised.getSoLuong()+Integer.parseInt(soLuongSP));
			}
			httpSession.setAttribute("cart", map);
		}
		
		resp.sendRedirect(req.getContextPath() + "/thanh-toan");
		req.setAttribute(soLuongSP, obj);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	private Map<String,ChiTietDonHangModel> extracted(Object obj){
		return (Map<String,ChiTietDonHangModel>) obj;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
