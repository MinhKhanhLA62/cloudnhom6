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

import vn.banhang.dao.KhachHangDao;
import vn.banhang.model.KhachHangModel;

/**
 * Servlet implementation class ListInforUserController
 */
@WebServlet("/thong-tin-khach-hang")
public class ListInforUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		KhachHangDao khDAO=new KhachHangDao();
		List<KhachHangModel> listAllKhachHang= khDAO.getAllTaiKhoan();
		req.setAttribute("allTaiKhoan", listAllKhachHang);
		
//		Chuyen huong trang trả về trang cần trả
		RequestDispatcher rq= req.getRequestDispatcher("/viewsAdmin/list_infor_user.jsp");
		rq.forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
