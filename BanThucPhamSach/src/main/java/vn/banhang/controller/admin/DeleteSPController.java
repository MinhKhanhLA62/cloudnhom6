package vn.banhang.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.dao.LoaiSanPhamDAO;
import vn.banhang.dao.SanPhamDAO;

/**
 * Servlet implementation class DeleteSPController
 */
@WebServlet("/xoa-san-pham-admin")
public class DeleteSPController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String maSP= req.getParameter("maSP");
		SanPhamDAO spDAO=new SanPhamDAO();
		spDAO.xoaSanPham(maSP);
		
		
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
