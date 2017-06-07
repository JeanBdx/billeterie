package soa.jaxrslabs.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.DocumentException;

import soa.jaxrslabs.beans.billeterie.*;
import soa.jaxrslabs.metier.*;

/**
 * Servlet implementation class Reservation
 * 
 * @see Reservation
 */
@WebServlet("/Reservation")
public class ReservationPlace extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationPlace() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * Récupération des informations saisies par l'utilisateur.
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id_event = request.getParameter("id_event");
		String categorie = request.getParameter("categorie");
		String zone = request.getParameter("zone");
		String rang = request.getParameter("rang");
		String civilite = request.getParameter("Civilite_Acheteur");
		String place = request.getParameter("place");
	    String nom = request.getParameter( "Nom_Acheteur" );
	    String prenom = request.getParameter( "Prenom_Acheteur" );
	    String adresse = request.getParameter( "Adresse_Acheteur" );
	    String telephone = request.getParameter( "Tel_Acheteur" );
	    String email = request.getParameter( "Mail_Acheteur" );
	    String Civilite_Billet = null;
	    String Nom_Billet = null;
	    String Prenom_Billet = null;
	 
	   
	    /**
	     * Récupération d'informations complémentaire si l'acheteur est différent du participant
	     * 
	     * @see Participant
	     * @see Acheteur
	     * 
	     */
	    if( request.getParameter("Bouton_Different") == "different") {
	    	Civilite_Billet = request.getParameter("Civilite_Billet");
	    	Nom_Billet = request.getParameter("Nom_Billet");
	    	Prenom_Billet = request.getParameter("Prenom_Billet");	
	    }else{
	    	Nom_Billet = nom;
	    	Prenom_Billet = prenom;
	    	Civilite_Billet = civilite;
	    }
	    Properties prop = new Properties();
		InputStream input = this.getServletContext().getResourceAsStream("WEB-INF/chemin.properties");
		prop.load(input);
		String chemin = prop.getProperty("mon_path_xml");
		Evenement e = GestionEvent.getEvenement(chemin, id_event);
	    InformationEvent info = e.getInformationEvent();
	    Participant p = new Participant(Civilite_Billet,Nom_Billet,Prenom_Billet);
	    Acheteur a = new Acheteur(civilite, nom, prenom, adresse, telephone, email);
	    Place myPlace = GestionEvent.getPlace(chemin, id_event, categorie, zone, rang, place);
	    Reservation r = new Reservation(a, e.getLieux().getLocalisation(), myPlace,categorie, zone);
	    Billet b  = new Billet(info,p,r);
	    
	    GestionEvent.reserverPlace(chemin, id_event, categorie, zone, myPlace.getEscalier(), myPlace.getNumero(), myPlace.getRang());
		try {
			GestionBillet.creerMail(chemin, b);
		} catch (DocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (GeneralSecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		response.sendRedirect("index.html");
		
	}

}