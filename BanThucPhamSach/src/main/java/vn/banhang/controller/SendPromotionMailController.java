package vn.banhang.controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.sendmail.SendMail;
import vn.banhang.dao.EmailKhuyenMaiDAO;

/**
 * Servlet implementation class SendMail
 */
@WebServlet("/gui-mail-khuyen-mai")
public class SendPromotionMailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		EmailKhuyenMaiDAO emailkm = new EmailKhuyenMaiDAO();
		String title = "Auto email from DBQ fresh food";
		String html = "<!DOCTYPE html>\r\n"
				+ "<html lang =" +"vi" + ">\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Auto email from DBQ Fresh food</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<p>Thanks for joining us</p>\r\n"
				+ "	<p>Check your email regularly so you don't miss the latest offers</p>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		String to = request.getParameter("email");

		if(to!=null) {
			SendMail.sendMail(to, title, html);
			emailkm.ThemEmailKhuyenMai(to);
		}

		RequestDispatcher rq= request.getRequestDispatcher("/index.jsp");
		rq.forward(request, response);
		
	}
}
