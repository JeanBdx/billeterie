package soa.jaxrslabs.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;

import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import soa.jaxrslabs.beans.billeterie.Evenement;
import soa.jaxrslabs.beans.billeterie.Zone;
import soa.jaxrslabs.metier.GestionEvent;

/**
 * Servlet implementation class InfoReservation
 * 
 * 
 * @author Jean Arhancetebehere
 */
@WebServlet("/InfoReservation")
public class InfoReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoReservation() {
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
		
		Properties prop = new Properties();
		InputStream input = this.getServletContext().getResourceAsStream("WEB-INF/chemin.properties");
		prop.load(input);
		String chemin = prop.getProperty("mon_path_xml");
		
		if(request.getParameter("mode").equals("info")){
			
			response.setContentType("application/json");
			String retour = new Gson().toJson(GestionEvent.getEvenements(chemin));
			response.getWriter().write(retour);
		}
		if(request.getParameter("mode").equals("getZone")){
			String idEvent = request.getParameter("idEvent");
			String nomCategorie = request.getParameter("nomCategorie");
			String retour = new Gson().toJson(GestionEvent.NomZones(chemin, idEvent, nomCategorie));
			response.getWriter().write(retour);
		}
		if(request.getParameter("mode").equals("getRang")){
			String idEvent = request.getParameter("idEvent");
			String nomCategorie = request.getParameter("nomCategorie");
			String nomZone = request.getParameter("nomZone");
			String retour = new Gson().toJson(GestionEvent.NomRang(chemin, idEvent, nomCategorie,nomZone));
			response.getWriter().write(retour);
		}
		if(request.getParameter("mode").equals("getPlace")){
			String idEvent = request.getParameter("idEvent");
			String nomCategorie = request.getParameter("nomCategorie");
			String nomZone = request.getParameter("nomZone");
			String nomRang = request.getParameter("nomRang");
			String retour = new Gson().toJson(GestionEvent.NomPlace(chemin, idEvent, nomCategorie, nomZone, nomRang));
			response.getWriter().write(retour);
		}
	}

}
