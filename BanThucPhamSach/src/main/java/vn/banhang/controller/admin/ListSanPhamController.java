package vn.banhang.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.dao.SanPhamDAO;
import vn.banhang.model.SanPhamModel;

/**
 * Servlet implementation class ListSanPhamController
 */
@WebServlet("/danh-sach-san-pham-admin")
public class ListSanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String phanLoai=req.getParameter("phanLoai");
		SanPhamDAO productDao = new SanPhamDAO();
		List<SanPhamModel> listSanPhamTheoLoai = productDao.getSanPhamTheoLoai(phanLoai);
		List<SanPhamModel> listAllSanPham = productDao.getAllSanPham();
		if(phanLoai.equals("all"))
			req.setAttribute("sanPhamTheoLoai", listAllSanPham);
		else
			req.setAttribute("sanPhamTheoLoai", listSanPhamTheoLoai);
		
//		Chuyen huong trang trả về trang cần trả
		RequestDispatcher rq= req.getRequestDispatcher("/viewsAdmin/list_sanpham.jsp");
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
