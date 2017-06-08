package soa.jaxrslabs.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soa.jaxrslabs.*;
import soa.jaxrslabs.beans.billeterie.Categorie;
import soa.jaxrslabs.metier.GestionEvent;
/**
 * Servlet implementation class CreationLieu
 * 
 * @see Lieux
 * @author Jean Arhancetebehere
 */
@WebServlet("/CreationLieu")
public class CreationLieu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreationLieu() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    }
    
	@Override
	/**
	 * Récupération des données saisies par l'administrateur.
	 *  
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String localisation = request.getParameter("localisation");
		String nbCategories = request.getParameter("nbCategorie");
		ArrayList<Categorie> categories = new ArrayList<>();
		Properties prop = new Properties();
		InputStream input = this.getServletContext().getResourceAsStream("WEB-INF/chemin.properties");
		prop.load(input);
		String chemin = prop.getProperty("mon_path_xml");
		GestionEvent g = new GestionEvent(chemin);
		for(int i=1;i<=Integer.valueOf(nbCategories);i++){
			String nomCategorie = request.getParameter("label_categorie_"+i);
			int nbZone = Integer.valueOf(request.getParameter("nrb_zones_"+i));
			int nbRang = Integer.valueOf(request.getParameter("nrb_rangs_"+i));
			int nbPlace = Integer.valueOf(request.getParameter("nrb_places_"+i));
			ArrayList<Integer> prix = new ArrayList<>();
			for(int j=1;j<=nbZone;j++){
				prix.add(Integer.valueOf(request.getParameter("prix_place_"+j)));
			}
			categories.add(g.createCategorie(nomCategorie, nbZone, nbRang, nbPlace, prix.stream().mapToInt(Integer::intValue).toArray()));
		}
	;

	g.createLieu(localisation, categories);
	response.sendRedirect("AdminChoix.jsp");
	}

}
