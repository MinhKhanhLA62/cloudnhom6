package vn.banhang.controller.admin;

import vn.banhang.dao.LoaiSanPhamDAO;
import vn.banhang.dao.SanPhamDAO;
import vn.banhang.model.LoaiSanPhamModel;
import vn.banhang.model.SanPhamModel;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditSPController
 */
@WebServlet("/sua-san-pham-admin")
public class EditSPController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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

		String maSP= req.getParameter("maSP");
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		// Tìm 1 sản phẩm
		SanPhamModel sanPham = sanPhamDAO.getOneSanPham(maSP);


		req.setAttribute("sp", sanPham);
		req.getRequestDispatcher("/viewsAdmin/edit-SP.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest req, HttpServletResponse resp)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
