package Monitoring;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Mailoutput {
	
	
	
public Mailoutput() {
	



}

public static void sendGMX() throws MessagingException
{
    String sender = "poorv@gmx.de";
    String password = "Docker123";
    String receiver = "timhel93@gmail.com";

    Properties properties = new Properties();

    properties.put("mail.transport.protocol", "smtp");
    properties.put("mail.smtp.host", "mail.gmx.net");
    properties.put("mail.smtp.port", "587");
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.user", sender);
    properties.put("mail.smtp.password", password);
    properties.put("mail.smtp.starttls.enable", "true");

    Session mailSession = Session.getInstance(properties, new Authenticator()
    {
        @Override
        protected PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(properties.getProperty("mail.smtp.user"),
                    properties.getProperty("mail.smtp.password"));
        }
    });

    Message message = new MimeMessage(mailSession);
    InternetAddress addressTo = new InternetAddress(receiver);
    message.setRecipient(Message.RecipientType.TO, addressTo);
    message.setFrom(new InternetAddress(sender));
    message.setSubject("Warning Warning caution");
    message.setContent("This is the message content", "text/plain");
    Transport.send(message);
}

}
