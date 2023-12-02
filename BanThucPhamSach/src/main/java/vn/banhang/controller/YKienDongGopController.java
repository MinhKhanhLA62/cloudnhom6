package vn.banhang.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.dao.YKienDongGopDAO;
import vn.banhang.sendmail.SendMail;


@WebServlet("/dong-gop-y-kien")
public class YKienDongGopController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		YKienDongGopDAO yKienDao = new YKienDongGopDAO();
		String title = "Auto email from DBQ fresh food";
		String html = "<!DOCTYPE html>\r\n"
				+ "<html lang =" +"vi" + ">\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Auto email from DBQ Fresh food</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<p>Thank you for comment.</p>\r\n"
				+ "	<p>We will try to improve the service better!</p>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		String to = request.getParameter("email");
		String yKien = request.getParameter("ykien");
		String hoTen = request.getParameter("hoten");

		if(to!=null) {
			SendMail.sendMail(to, title, html);
			yKienDao.ThemEmailDongGop(to, hoTen, yKien);
		}

		RequestDispatcher rq= request.getRequestDispatcher("/index.jsp");
		rq.forward(request, response);
		
	}

}
