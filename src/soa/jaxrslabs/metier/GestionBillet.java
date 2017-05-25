
package soa.jaxrslabs.metier;

import javax.jws.WebService;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import soa.jaxrslabs.billeterie.*;

@WebService
public class GestionBillet {
	private static final String password = "QmJaLrMp2K17";
	
	public void creerMail(Billet b) {

		try {

			Properties props = System.getProperties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");

	        Session session = Session.getInstance(props,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication("mylittleticket.event@gmail.com", password);
	                    }
	                });
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("mylittleticket.event@gmail.com"));
			InternetAddress[] internetAddresses = new InternetAddress[1];
			internetAddresses[0] = new InternetAddress("quentin.muller@live.fr");
			message.setRecipients(Message.RecipientType.TO, internetAddresses);
			message.setSubject("Evenement"+b.getInformationEvent().getNomEvent()+" du "+b.getInformationEvent().getDateEvent());
			message.setText("Bonjour,");
			message.setText("Veuillez trouver ci-joint le billet pour : ");
			message.setText(b.getInformationEvent().getNomEvent() +" - " + b.getReservation().getNomLieux());
			message.setText("Le "+b.getInformationEvent().getDateEvent());
			message.setText("Merci de votre réservation,");
			message.setText("L'équipe MyLittleTicket");
	
			message.setSentDate(new Date());
			Transport.send(message);
		} catch (AddressException e) {

			e.printStackTrace();

		} catch (MessagingException e) {

			e.printStackTrace();

		}

	}
	
	public void genererPdfBillet(Billet b){
		
	}

}
