package com.brainmentors.billing.utils;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public interface MailSender {
	public static void sendMail() {
//		 final String username = "harshg957@gmail.com";
//	        final String password = "graphics26@/";
//
//	        Properties prop = new Properties();
//			prop.put("mail.smtp.host", "smtp.gmail.com");
//	        prop.put("mail.smtp.port", "587");
//	        prop.put("mail.smtp.auth", "true");
//	        prop.put("mail.smtp.starttls.enable", "true"); //TLS
//	        
//	        Session session = Session.getInstance(prop,
//	                new javax.mail.Authenticator() {
//	                    protected PasswordAuthentication getPasswordAuthentication() {
//	                        return new PasswordAuthentication(username, password);
//	                    }
//	                });
//
//	        try {
//
//	            Message message = new MimeMessage(session);
//	            message.setFrom(new InternetAddress("harshg957@gmail.com"));
//	            message.setRecipients(
//	                    Message.RecipientType.TO,
//	                    InternetAddress.parse("srishti.gupta19@dsb.edu.in")
//	            );
//	            message.setSubject("Testing Gmail TLS");
//	            message.setText("Dear Mail Crawler,"
//	                    + "\n\n Please do not spam my email!");
//
//	            Transport.send(message);
//	        }
//	        catch(Exception e) {
//	        	e.printStackTrace();
//	        }

//		  String to = "harshg957@gmail.com";//change accordingly  
//	      String from = "harshg957@gmail.com";//change accordingly  
//	      String host = "localhost";//or IP address  
//	  
//	     //Get the session object  
//	      Properties properties = System.getProperties();  
//	      properties.setProperty("mail.smtp.host", host);  
//	      Session session = Session.getDefaultInstance(properties);  
//	  
//	     //compose the message  
//	      try{  
//	         MimeMessage message = new MimeMessage(session);  
//	         message.setFrom(new InternetAddress(from));  
//	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
//	         message.setSubject("Ping");  
//	         message.setText("Hello, this is example of sending email  ");  
//	  
//	         // Send message  
//	         Transport.send(message);  
//	         System.out.println("message sent successfully....");  
//	  
//	      }catch (MessagingException mex) {
//	    	  mex.printStackTrace();
//	    	  }  
	   
	}  
	}

