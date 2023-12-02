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

@WebServlet(urlPatterns = {"/cua-hang"})
public class ShopGridController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3137518098965794894L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
//		Khởi tạo Dao
		SanPhamDAO productDao = new SanPhamDAO();
//		Lấy tham số từ JSP
		String phanLoai=req.getParameter("phanLoai");
		

//		Sử dụng đối tượng list để chứa danh sách từ ProductDAO
		List<SanPhamModel> listTop3SanPhamMoiNhat = productDao.getTop3SanPhamMoiNhat();
		List<SanPhamModel> listTop3SanPhamMoiNhat2 = productDao.getTop3SanPhamMoiNhat2();
		List<SanPhamModel> listSanPhamTheoLoai = productDao.getSanPhamTheoLoai(phanLoai);
//		List<SanPhamModel> listAllSanPham = productDao.getAllSanPham();
		List<SanPhamModel> listAllSanPhamGiamGia = productDao.getAllSanPhamGiamGia();
		
//		Phân trang
		String soTrang=req.getParameter("soTrang");
		if(soTrang == null) {
			soTrang="1";
		}
		int so=Integer.parseInt(soTrang);
		int count=productDao.getDemSoLuongSanPham();
		int trangCuoi=count/6;
		if(count %6 != 0) {
			trangCuoi++;
		}
		req.setAttribute("trangCuoi", trangCuoi);
		req.setAttribute("tag", so);
		List<SanPhamModel> listSanPhamPhanTrang = productDao.getSanPhamPhanTrang(so);
		
		
//		Thiết lập dữ liệu lên JSP
		req.setAttribute("top3SanPhamMoiNhat", listTop3SanPhamMoiNhat);
		req.setAttribute("top3SanPhamMoiNhat2", listTop3SanPhamMoiNhat2);
		
		if(phanLoai.equals("all")) {
			req.setAttribute("sanPhamTheoLoai", /*listAllSanPham*/listSanPhamPhanTrang);
		}
		else
			req.setAttribute("sanPhamTheoLoai", listSanPhamTheoLoai);
		req.setAttribute("allSanPhamGiamGia", listAllSanPhamGiamGia);
		
//		Khởi tạo Dao		
		LoaiSanPhamDAO loaiSPDao= new LoaiSanPhamDAO();
//		Sử dụng đối tượng list để chứa danh sách từ loaiSPDao		
		List<LoaiSanPhamModel> listAllLoaiSanPham = loaiSPDao.getAllLoaiSanPham();
//		Thiết lập dữ liệu lên JSP
		req.setAttribute("allLoaiSanPham", listAllLoaiSanPham);

		req.setAttribute("tichXanhMucChon", phanLoai);
		
//		Chuyen huong trang trả về trang cần trả
		RequestDispatcher rq= req.getRequestDispatcher("/shop-grid.jsp");
		rq.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
