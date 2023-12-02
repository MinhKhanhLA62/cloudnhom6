package vn.banhang.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.SpringLayout.Constraints;

import vn.banhang.dao.LoginDAO;
import vn.banhang.model.AccountModel;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/dang-nhap")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Check Session
		HttpSession session=req.getSession(false);
		if(session!=null && session.getAttribute("account")!=null) {
			resp.sendRedirect(req.getContextPath()+"/trang-chu");
		return;
		}
//		Check cookie
		Cookie[] cookies=req.getCookies();
		if(cookies!=null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("user")) {
					session=req.getSession(true);
					session.setAttribute("user", cookie.getValue());
					resp.sendRedirect(req.getContextPath()+"/trang-chu");
					return;
				}
			}
		}
//		Chuyen huong trang nếu Session == null
		RequestDispatcher rq= req.getRequestDispatcher("/login.jsp");
		rq.forward(req, resp);
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Thiết lập tiếng việt
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String username =req.getParameter("user");
		String password =req.getParameter("pass");
		String messCTL="";
		if(username.isEmpty() || password.isEmpty()) {
			messCTL="Chưa có nhập má ơi";
			req.setAttribute("mess", messCTL);
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
			return;
		}
		LoginDAO lgDao=new LoginDAO();
		AccountModel acc= lgDao.dangNhapKH(username, password);
		AccountModel acc2= lgDao.dangNhapAdmin(username, password);
		if(acc != null && acc2 == null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("account", acc);
			resp.sendRedirect(req.getContextPath()+"/trang-chu");
		}
		else {
			if(acc == null && acc2 != null) {
				HttpSession session=req.getSession(true);
				session.setAttribute("accountAdmin", acc2);
				resp.sendRedirect(req.getContextPath()+"/trang-chu-admin");
			}
			else {
				messCTL="Tài khoản mật khẩu không đúng";
				req.setAttribute("mess", messCTL);
				req.getRequestDispatcher("/login.jsp").forward(req, resp);
			}			
		}
		
		
	
		
	}

}
