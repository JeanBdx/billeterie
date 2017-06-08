package soa.jaxrslabs.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soa.jaxrslabs.beans.billeterie.Evenement;
import soa.jaxrslabs.metier.GestionEvent;

/**
 * Servlet implementation class SupprimerEvent
 * 
 * 
 * 
 * @author Jean Arhancetebehere
 */
@WebServlet("/SupprimerEvent")
public class SupprimerEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerEvent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idEvent = request.getParameter("idEvent");
		
		Properties prop = new Properties();
		InputStream input = this.getServletContext().getResourceAsStream("WEB-INF/chemin.properties");
		prop.load(input);
		String chemin = prop.getProperty("mon_path_xml");
		GestionEvent g = new GestionEvent(chemin);
		Evenement e = g.getEvenement( idEvent);
		
		if(g.deleteEvent( e) == true){
			response.getWriter().write("ok");
		}
		
	}

}
