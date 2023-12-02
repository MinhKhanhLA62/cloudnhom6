package vn.banhang.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.banhang.model.ChiTietDonHangModel;

/**
 * Servlet implementation class RemoveController
 */
@WebServlet("/xoa-san-pham")
public class RemoveItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		HttpSession httpSession=req.getSession();
		Object obj=httpSession.getAttribute("cart");
		String maSP=req.getParameter("maSP");
		if(obj!=null) {
			Map<String, ChiTietDonHangModel> map=(Map<String, ChiTietDonHangModel>) obj;
			map.remove(maSP);
			httpSession.setAttribute("cart", map);
		}
		resp.sendRedirect(req.getContextPath() + "/thanh-toan");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
