package Monitoring;

import javax.mail.MessagingException;

public class Mailversendentest {

	public static void main(String[] args) throws MessagingException {
		Mailoutput test = new Mailoutput();
		Mailoutput.sendGMX();

	}

}
