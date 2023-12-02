package vn.banhang.controller;

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
 * Servlet implementation class SearchController
 */
@WebServlet("/tim-kiem")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
//		Lấy tham số từ JSP
		String thongTinSP=req.getParameter("thongTinSP");
//		Khởi tạo Dao
		SanPhamDAO productDao = new SanPhamDAO();
//		Sử dụng đối tượng list để chứa danh sách từ ProductDAO
		List<SanPhamModel> listTimKiemSanPham = productDao.getTimKiemSanPham(thongTinSP);
		
//		Thiết lập dữ liệu lên JSP
		req.setAttribute("sanPhamTheoLoai", listTimKiemSanPham);
		req.setAttribute("value_thongTinSP", thongTinSP);

		
//	--------------------------------------------------------------------------------------------------	
//		Lấy từ ShopGridController
		
		
//		Lấy tham số từ JSP
		String phanLoai=req.getParameter("phanLoai");

//		Sử dụng đối tượng list để chứa danh sách từ ProductDAO
		List<SanPhamModel> listTop3SanPhamMoiNhat = productDao.getTop3SanPhamMoiNhat();
		List<SanPhamModel> listTop3SanPhamMoiNhat2 = productDao.getTop3SanPhamMoiNhat2();

		List<SanPhamModel> listAllSanPhamGiamGia = productDao.getAllSanPhamGiamGia();
		
//		Thiết lập dữ liệu lên JSP
		req.setAttribute("top3SanPhamMoiNhat", listTop3SanPhamMoiNhat);
		req.setAttribute("top3SanPhamMoiNhat2", listTop3SanPhamMoiNhat2);
		
		req.setAttribute("allSanPhamGiamGia", listAllSanPhamGiamGia);
		
//		Khởi tạo Dao		
		LoaiSanPhamDAO loaiSPDao= new LoaiSanPhamDAO();
//		Sử dụng đối tượng list để chứa danh sách từ loaiSPDao		
		List<LoaiSanPhamModel> listAllLoaiSanPham = loaiSPDao.getAllLoaiSanPham();
//		Thiết lập dữ liệu lên JSP
		req.setAttribute("allLoaiSanPham", listAllLoaiSanPham);

		req.setAttribute("tichXanhMucChon", phanLoai);
//	------------------------------------------------------------------------------------
		
//		Chuyen huong trang trả về trang cần trả
		RequestDispatcher rq= req.getRequestDispatcher("/shop-grid.jsp");
//		RequestDispatcher rq= req.getRequestDispatcher("cua-hang");
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
