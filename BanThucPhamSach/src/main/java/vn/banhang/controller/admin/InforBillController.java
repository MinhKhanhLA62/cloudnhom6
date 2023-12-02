package vn.banhang.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.dao.ChiTietDonHangDao;
import vn.banhang.model.ChiTietDonHangModel;

/**
 * Servlet implementation class InforBillController
 */
@WebServlet("/thong-tin-don-hang-admin")
public class InforBillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String maDon=req.getParameter("maDon");
		ChiTietDonHangDao ctdhDAO= new ChiTietDonHangDao();
		List<ChiTietDonHangModel> listInforBill= ctdhDAO.getAllDonHang(maDon);
		
		req.setAttribute("inforBill", listInforBill);
		
		
//		Chuyen huong trang trả về trang cần trả
		RequestDispatcher rq= req.getRequestDispatcher("/viewsAdmin/infor-bill.jsp");
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
