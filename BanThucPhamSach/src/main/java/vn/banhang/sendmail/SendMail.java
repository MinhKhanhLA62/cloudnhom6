package vn.banhang.sendmail;

import java.util.*;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
	/*
	*/
	
	 public static void sendMail(String recieverMail, String title, String html) {

	        // Recipient's email ID needs to be mentioned.
	        String to = recieverMail;

	        // Sender's email ID needs to be mentioned
	        String from = "nhom09cnpm@gmail.com";
	        String pass = "jqhgdivgedxyfdqw";
	        
	        // Assuming you are sending email from through gmails smtp
	        String host = "smtp.gmail.com";

	        Properties properties = new Properties();

	        // Setup mail server
	        properties.put("mail.smtp.host", host);
	        properties.put("mail.smtp.port", "587");
	        properties.put("mail.smtp.auth", "true");
	        properties.put("mail.smtp.starttls.enable", "true");

	        ///System.getenv("EMAIL");

	        // Get the Session object.// and pass username and password
	        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

	            protected PasswordAuthentication getPasswordAuthentication() {
	                 //setup app password reference https://support.google.com/accounts/answer/185833?hl=en
	                return new PasswordAuthentication(from,pass);

	            }

	        });

	        // Used to debug SMTP issues
	        session.setDebug(true);

	        try {
	            // Create a default MimeMessage object.
	            MimeMessage message = new MimeMessage(session);

	            // Set From: header field of the header.
	            message.setFrom(new InternetAddress(from));

	            // Set To: header field of the header.
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	            // Set Subject: header field
	            message.setSubject(title);

	            // Now set the actual message
	            message.setContent(html, "text/html");
	            System.out.println("sending...");
	            // Send message
	            Transport.send(message);
	            System.out.println("Sent message successfully....");
	        } catch (MessagingException mex) {
	            mex.printStackTrace();
	        }

	    }
}
