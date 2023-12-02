package vn.banhang.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.dao.LoaiSanPhamDAO;

/**
 * Servlet implementation class InsertLoaiSP
 */
@WebServlet("/them-loai-san-pham-admin")
public class InsertLoaiSPController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String maLSP= req.getParameter("maLSP");
		String tenLSP=req.getParameter("tenLSP");
		
		LoaiSanPhamDAO lspDAO=new LoaiSanPhamDAO();
		if(maLSP.isEmpty() || tenLSP.isEmpty()) {
			req.getRequestDispatcher("/viewsAdmin/insert-LoaiSP.jsp").forward(req, resp);
			return;
		}
		lspDAO.themLoaiSanPham(maLSP, tenLSP);
		RequestDispatcher rq= req.getRequestDispatcher("loai-san-pham-admin");
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
