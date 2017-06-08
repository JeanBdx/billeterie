
package soa.jaxrslabs.metier;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.tool.xml.ElementList;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.sun.mail.util.MailSSLSocketFactory;

import soa.jaxrslabs.beans.billeterie.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.jws.WebService;
import javax.mail.*;
import javax.mail.internet.*;

import java.io.InputStream;
import java.util.*;

/**
 * 
 * Fonction qui va administrer la gestion des billets :
 * <ul>
 * <li>Création du Billet</li>
 * <li>Envoi à l'Acheteur</li>
 * </ul>
 *
 *	@author Jean Arhancetebehere
 */
@WebService
public class GestionBillet {
	private static final String password = "QmJaLrMp2K17";

	private Billet b;
	private String chemin;
	
	
	
	public GestionBillet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public GestionBillet(Billet b, String chemin) {
		super();
		this.b = b;
		this.chemin = chemin;
	}



	/**
	 * Fonction d'envoi du billet par Mail
	 * 
	 * @param chemin - le chemin du pdf qui est stocke temporairement
	 * @param b - l'objet Billet qui contient toutes le informations a avoir sur un billet
	 * @throws IOException
	 * @throws DocumentException
	 * @throws GeneralSecurityException
	 */
	public void creerMail() throws IOException, DocumentException, GeneralSecurityException {

		try {
			MailSSLSocketFactory sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true); 
			
			Properties props = System.getProperties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.imap.ssl.trust", "*");
			props.put("mail.imap.ssl.socketFactory", sf);
			Session session = Session.getInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("mylittleticket.event@gmail.com", password);
				}
			});
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("mylittleticket.event@gmail.com"));
			InternetAddress[] internetAddresses = new InternetAddress[1];
			internetAddresses[0] = new InternetAddress(b.getReservation().getAcheteur().getMail());
			message.setRecipients(Message.RecipientType.TO, internetAddresses);
			
			
			Multipart multipart = new MimeMultipart();
			StringBuilder chaine = new StringBuilder();
			BodyPart messageBodyPart = new MimeBodyPart();
			message.setSubject("Evenement " + b.getInformationEvent().getNomEvent() + " du "
					+ b.getInformationEvent().getDateEvent());
			chaine.append("Madame, Monsieur <br><br>");
			chaine.append("Veuillez trouver ci-joint le billet pour : <br>");
			chaine.append(b.getInformationEvent().getNomEvent() + " - " + b.getReservation().getNomLieux()+"<br>");
			chaine.append("Le " + b.getInformationEvent().getDateEvent()+"<br>");
			chaine.append("Merci de votre r�servation,<br><br>");
			chaine.append("L'�quipe MyLittleTicket");
			messageBodyPart.setText(chaine.toString());
			messageBodyPart.setContent(chaine.toString(), "text/html");
			multipart.addBodyPart(messageBodyPart);
			
			chemin += "/Reservation_" + b.getParticipant().getNom() + ".pdf";
			genererPdfBillet();
			
			// creation et ajout de la piece jointe
			messageBodyPart = new MimeBodyPart();
			DataSource source = new FileDataSource(chemin);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName("Reservation_" + b.getParticipant().getNom() + ".pdf");
			multipart.addBodyPart(messageBodyPart);

			// ajout des �l�ments au mail
			message.setContent(multipart);

			message.setSentDate(new Date());
			Transport.send(message);
			File MyFile = new File(chemin);
			MyFile.delete();
		} catch (AddressException e) {

			e.printStackTrace();

		} catch (MessagingException e) {

			e.printStackTrace();

		}

	}
	
	/**
	 * Fonction qui va générer le Billet en PDF et le stocke temporairement
	 * 
	 * @param chemin - le chemin du pdf qui est stocke temporairement
	 * @param b - l'objet Billet qui contient toutes le informations a avoir sur un billet
	 * @throws IOException
	 * @throws DocumentException
	 */
	public void genererPdfBillet() throws IOException, DocumentException {
		Document document = new Document();

		PdfWriter.getInstance(document, new FileOutputStream(chemin));
		// step 3
		document.open();
		// step 4
		StringBuilder sb = new StringBuilder();

		  sb.append("<html lang=\"fr\">");
		  sb.append("<head>");
		  sb.append("<style type=\"text/css\">");
		  sb.append("body {");
		  sb.append("overflow-x: hidden;");
		  sb.append("font-family: \"Roboto Slab\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;");
		  sb.append("}");
		  sb.append("  .text-muted {");
		  sb.append("color: #777777;");
		  sb.append("  }");
		  sb.append("  .text-primary {");
		  sb.append("    color: #fed136;");
		  sb.append("  }");
		  sb.append("  p {");
		  sb.append("    font-size: 14px;");
		  sb.append("    line-height: 1.75;");
		  sb.append("  }");
		  sb.append("  p.large {");
		  sb.append("    font-size: 16px;");
		  sb.append("  }");
		  sb.append("</style>");
		  sb.append("</head>");
		  sb.append("<body id=\"page-top\" class=\"index\">");
		  sb.append("<div class=\"container\">");
		  sb.append("  <div>");
		  sb.append("        <h2 class=\"section-heading\">BILLET " + b.getInformationEvent().getNomEvent() + "</h2>");
		  sb.append("  </div>");
		  sb.append("  <div>");
		  sb.append("        <p> Date :" + b.getInformationEvent().getDateEvent() + " </p>");
		  sb.append("        <p> Lieu :" + b.getReservation().getNomLieux() + " </p>");
		  sb.append("  		 <p> Categorie " + b.getReservation().getNomCategorie() + "</p>");
		  sb.append("        <p> Zone : " + b.getReservation().getNomZone() + " </p>");
		  sb.append("  		 <p> Rang " + b.getReservation().getPlace().getRang() + "</p>");
		  sb.append("        <p> Escalier : " + b.getReservation().getPlace().getEscalier() + " </p>");
		  sb.append("        <p> Place : " +b.getReservation().getPlace().getNumero()+ " </p>");
		  sb.append("  </div>");
		  sb.append("  <hr></hr>");
		  sb.append("  <div >");
		  sb.append("  <p> IDENTITE DU SPECTATEUR </p>");
		  sb.append("  <p> Nom: " + b.getParticipant().getNom() + "</p>");
		  sb.append("  <p> Pr�nom : " + b.getParticipant().getPrenom() + " </p>");
		  sb.append("  </div>");
		  sb.append("  </div>");
		  sb.append("</body>");
		  sb.append("</html>");

		PdfPTable table = new PdfPTable(1);
		PdfPCell cell = new PdfPCell();
		ElementList list = XMLWorkerHelper.parseToElementList(sb.toString(), null);
		for (Element element : list) {
			cell.addElement(element);
		}
		table.addCell(cell);
		document.add(table);
		document.close();

	}

}
