package com.xworkz.parking.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ParkingEmail {

	public static boolean sendMail(String email, String name) {
		String to = email;// change accordingly
		String from = "jayanthcs634@outlook.com";// change accordingly
		String password = "Jay@1234";
		String host = "smtp.office365.com";// or IP address

		// Get the session object
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.debug", "true");
		properties.put("mail.transport.protocol", "smtp");

		Session session = Session.getDefaultInstance(properties, null);

		// compose the message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("hi");
			message.setText("Hello, this is example of sending email  ");

			// Send message
			Transport.send(message, from, password);
			System.out.println("message sent successfully....");

		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
		return true;
	}
}
