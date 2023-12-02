package vn.banhang.controller.admin;

import vn.banhang.dao.SanPhamDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SubmitInsertSPController
 */
@WebServlet("/xac-nhan-sua-san-pham-admin")
public class SubmitEditSPController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		String maSP =req.getParameter("maSP");
		String tenSP =req.getParameter("tenSP");
		int Gia = Integer.parseInt(req.getParameter("Gia"));
		double soLuong = Double.parseDouble(req.getParameter("soLuong"));
		String phanLoai =req.getParameter("phanLoai");
		String doTuoiKho =req.getParameter("doTuoiKho");
		int giamGia =Integer.parseInt(req.getParameter("giamGia"));
		String moTa =req.getParameter("moTa");
		String ngay =req.getParameter("ngay");
		String hinhAnh =req.getParameter("hinhAnh");

		if(moTa==null)
			moTa="null";
		if(ngay==null)
			ngay="null";
		if(hinhAnh==null)
			hinhAnh="null";
		
		SanPhamDAO productDao = new SanPhamDAO();
		productDao.suaSanPham(tenSP, Gia, soLuong, phanLoai, doTuoiKho, giamGia, moTa, ngay, hinhAnh, maSP);
		
//		Chuyen huong trang trả về trang cần trả
		RequestDispatcher rq= req.getRequestDispatcher("danh-sach-san-pham-admin?phanLoai=all");
		rq.forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
