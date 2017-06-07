
package soa.jaxrslabs.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import soa.jaxrslabs.beans.utilisateur.*;
/**
 * Servlet permettant de gérer la connexion de l'administrateur.
 * 
 * @see ConnexionForm
 *
 */
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String ATT_USER         = "utilisateur";
    public static final String ATT_FORM         = "form";
    public static final String ATT_SESSION_USER = "sessionUtilisateur";
    public static final String VUE              = "connexion.jsp"; // VOIR SI LE NOM EST CORRECT DU JSP
    
    /**
     * Affichage de la page de connexion.
     * 
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     * 
     */
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Affichage de la page de connexion */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
    
    /**
     * Récupération des données formulaire + vérification.
     * <ul>
     * <li>Si tout est ok : Connexion</li>
     * <li>Si erreur : suppression de session</li>
     * </ul>
     * 
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     * 
     */
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Préparation de l'objet formulaire */
        ConnexionForm form = new ConnexionForm();
    	Properties prop = new Properties();
		InputStream input = this.getServletContext().getResourceAsStream("WEB-INF/chemin.properties");
		prop.load(input);
		String identifiant = prop.getProperty("identifiant");
		String password = prop.getProperty("password");
        /* Traitement de la requête et récupération du bean en résultant */
        Utilisateur utilisateur = form.connecterUtilisateur( request,identifiant,password );

        /* Récupération de la session depuis la requête */
        HttpSession session = request.getSession();

        /**
         * Si aucune erreur de validation n'a eu lieu, alors ajout du bean
         * Utilisateur à la session, sinon suppression du bean de la session.
         */
        if ( form.getErreurs().isEmpty() ) {
            session.setAttribute( ATT_SESSION_USER, utilisateur );
        } else {
            session.setAttribute( ATT_SESSION_USER, null );
        }

        
        response.sendRedirect("AdminChoix.jsp");
    }
}