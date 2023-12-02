package vn.banhang.controller;

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
 * Servlet implementation class ShopDetailsController
 */
@WebServlet("/thong-tin-san-pham")
public class ShopDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
//		Lấy tham số từ JSP
		String maSP=req.getParameter("maSP");
//		Khởi tạo Dao
		SanPhamDAO productDao = new SanPhamDAO();
//		Sử dụng đối tượng list để chứa danh sách từ ProductDAO
		SanPhamModel listOneSanPham = productDao.getOneSanPham(maSP);
		List<SanPhamModel> list4SanPham = productDao.get4SanPham(maSP);
		List<SanPhamModel> listAllSanPham = productDao.getAllSanPham();
		
//		Thiết lập dữ liệu lên JSP
		req.setAttribute("ngauNhien4SanPham", list4SanPham);
		req.setAttribute("oneSanPham", listOneSanPham);
		req.setAttribute("allSanPham", listAllSanPham);
		
//		Chuyen huong trang trả về trang cần trả
		RequestDispatcher rq= req.getRequestDispatcher("/shop-details.jsp");
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
