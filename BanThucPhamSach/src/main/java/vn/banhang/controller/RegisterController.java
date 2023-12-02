package vn.banhang.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.dao.LoginDAO;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/dang-ky")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		String dkTen=req.getParameter("ten");
		String dkDiaChi=req.getParameter("diaChi");
		String dkSDT=req.getParameter("SDT");
		String dkMK=req.getParameter("pswd");
		
		LoginDAO lgDao=new LoginDAO();
		if(lgDao.checkTaiKhoan(dkSDT)==false) {
			lgDao.dangKi(dkSDT, dkMK, dkTen, dkDiaChi);
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}		
		else
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		
	}

}
