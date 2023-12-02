package vn.banhang.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.dao.LoaiSanPhamDAO;
import vn.banhang.dao.SanPhamDAO;
import vn.banhang.model.LoaiSanPhamModel;
import vn.banhang.model.SanPhamModel;

/**
 * Servlet implementation class ListLoaiSanPhamController
 */
@WebServlet("/loai-san-pham-admin")
public class ListLoaiSanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
//		Khởi tạo Dao		
		LoaiSanPhamDAO loaiSPDao= new LoaiSanPhamDAO();
//		Sử dụng đối tượng list để chứa danh sách từ loaiSPDao		
		List<LoaiSanPhamModel> listAllLoaiSanPham = loaiSPDao.getAllLoaiSanPham();
//		Thiết lập dữ liệu lên JSP
		req.setAttribute("allLoaiSanPham", listAllLoaiSanPham);
		
		RequestDispatcher rq= req.getRequestDispatcher("/viewsAdmin/list_loaiSP.jsp");
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
