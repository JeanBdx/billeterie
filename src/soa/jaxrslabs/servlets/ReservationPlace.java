package soa.jaxrslabs.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soa.jaxrslabs.billeterie.*;
import soa.jaxrslabs.metier.*;

/**
 * Servlet implementation class Reservation
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//
		
	    /*
	     * Récupération des données saisies, envoyées en tant que paramètres de
	     * la requête POST générée à la validation du formulaire
	     */
		String id_event = request.getParameter("id_event");
		String categorie = request.getParameter("categorie");
		String zone = request.getParameter("zone");
		String civilite = request.getParameter("Civilite_Acheteur");
		String id_place = request.getParameter("place");
	    String nom = request.getParameter( "Nom_Acheteur" );
	    String prenom = request.getParameter( "Prenom_Acheteur" );
	    String adresse = request.getParameter( "Adresse_Acheteur" );
	    String telephone = request.getParameter( "Tel_Acheteur" );
	    String email = request.getParameter( "Mail_Acheteur" );
	    String Civilite_Billet = null;
	    String Nom_Billet = null;
	    String Prenom_Billet = null;
	 
	    if( request.getParameter("Bouton_Different") == "different") {
	    	Civilite_Billet = request.getParameter("Civilite_Billet");
	    	Nom_Billet = request.getParameter("Nom_Billet");
	    	Prenom_Billet = request.getParameter("Prenom_Billet");	
	    }else{
	    	Nom_Billet = nom;
	    	Prenom_Billet = prenom;
	    	Civilite_Billet = civilite;
	    }
	    
	 
	    /*
	    DateTime dt = new DateTime();
	   
	    DateTimeFormatter formatter = DateTimeFormat.forPattern( "dd/MM/yyyy HH:mm:ss" );
	    String date = dt.toString( formatter );
	    */
	    
	
	    String message;

	   /* if ( nom.trim().isEmpty() || adresse.trim().isEmpty() || telephone.trim().isEmpty() || montant == -1
	            || modePaiement.isEmpty() || modeLivraison.isEmpty() ) {
	        message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"creerCommande.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'une commande.";
	    } else {
	        message = "Commande créée avec succès !";
	    }
	*/

	    /* Transmission à la page JSP en charge de l'affichage des données */
	  //  this.getServletContext().getRequestDispatcher( "/afficherCommande.jsp" ).forward( request, response );
		
		
	}

}