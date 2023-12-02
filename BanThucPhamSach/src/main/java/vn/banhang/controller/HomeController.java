package vn.banhang.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.dao.LoaiSanPhamDAO;
import vn.banhang.dao.SanPhamDAO;
import vn.banhang.model.LoaiSanPhamModel;
import vn.banhang.model.SanPhamModel;

@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 8113989266296503761L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
//		Lấy tham số từ JSP
		String phanLoai=req.getParameter("phanLoai");
//		Khởi tạo Dao
		SanPhamDAO productDao = new SanPhamDAO();
//		Sử dụng đối tượng list để chứa danh sách từ ProductDAO
		List<SanPhamModel> listTop3SanPhamMoiNhat = productDao.getTop3SanPhamMoiNhat();
		List<SanPhamModel> listTop3SanPhamMoiNhat2 = productDao.getTop3SanPhamMoiNhat2();
		List<SanPhamModel> listAllSanPhamDoTuoi = productDao.getAllSanPhamDoTuoi();
		List<SanPhamModel> listAllSanPhamDoKho = productDao.getAllSanPhamDoKho();
		List<SanPhamModel> listTop3SanPhamDanhGiaCao = productDao.getTop3SanPhamDanhGiaCao();
		List<SanPhamModel> listTopSanPhamBanChay = productDao.getTopSanPhamBanChay();
		List<SanPhamModel> listSanPhamTheoLoai = productDao.getSanPhamTheoLoai(phanLoai);
		
//		Thiết lập dữ liệu lên JSP
		req.setAttribute("top3SanPhamMoiNhat", listTop3SanPhamMoiNhat);
		req.setAttribute("top3SanPhamMoiNhat2", listTop3SanPhamMoiNhat2);
		req.setAttribute("allSanPhamDoTuoi", listAllSanPhamDoTuoi);
		req.setAttribute("allSanPhamDoKho", listAllSanPhamDoKho);
		req.setAttribute("top3SanPhamDanhGiaCao", listTop3SanPhamDanhGiaCao);
		req.setAttribute("topSanPhamBanChay", listTopSanPhamBanChay);
		req.setAttribute("sanPhamTheoLoai", listSanPhamTheoLoai);
		
		
//		Khởi tạo Dao		
		LoaiSanPhamDAO loaiSPDao= new LoaiSanPhamDAO();
//		Sử dụng đối tượng list để chứa danh sách từ loaiSPDao		
		List<LoaiSanPhamModel> listAllLoaiSanPham = loaiSPDao.getAllLoaiSanPham();
//		Thiết lập dữ liệu lên JSP
		req.setAttribute("allLoaiSanPham", listAllLoaiSanPham);
		
		
//		Chuyen huong trang trả về trang cần trả
		RequestDispatcher rq= req.getRequestDispatcher("/index.jsp");
		rq.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
