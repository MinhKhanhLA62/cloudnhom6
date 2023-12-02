package vn.banhang.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.banhang.dao.LoaiSanPhamDAO;
import vn.banhang.dao.LoginDAO;
import vn.banhang.dao.SanPhamDAO;
import vn.banhang.dao.DonHangDao;
import vn.banhang.dao.KhachHangDao;
import vn.banhang.model.AccountModel;
import vn.banhang.model.DonHangModel;
import vn.banhang.model.KhachHangModel;
import vn.banhang.model.LoaiSanPhamModel;
import vn.banhang.model.SanPhamModel;

/**
 * Servlet implementation class HomeAdminController
 */
@WebServlet("/trang-chu-admin")
public class HomeAdminController extends HttpServlet {
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
		
		SanPhamDAO productDao = new SanPhamDAO();
		List<SanPhamModel> listAllSanPham = productDao.getAllSanPham();
		req.setAttribute("allSanPham", listAllSanPham);
		
		
		KhachHangDao khDAO=new KhachHangDao();
		List<KhachHangModel> listAllKhachHang= khDAO.getAllTaiKhoan();
		req.setAttribute("allTaiKhoan", listAllKhachHang);
		
		DonHangDao dhDAO=new DonHangDao();
		List<DonHangModel> listAllDonHang= dhDAO.getAllDonHang();
		req.setAttribute("allDonHang", listAllDonHang);
		
//		Chuyen huong trang trả về trang cần trả
		RequestDispatcher rq= req.getRequestDispatcher("/viewsAdmin/index_Admin.jsp");
		rq.forward(req, resp);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
