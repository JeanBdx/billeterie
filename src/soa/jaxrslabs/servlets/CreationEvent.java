package soa.jaxrslabs.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soa.jaxrslabs.metier.GestionEvent;

/**
 * Servlet implementation class CreationEvent
 * 
 * @see GestionEvent
 * @author Jean Arhancetebehere
 */
@WebServlet("/CreationEvent")
public class CreationEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreationEvent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * Récupération des données saisies par l'administrateur.
	 *  
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idLieux = request.getParameter("idLieux");
		String date = request.getParameter("date_input");
		String heure = request.getParameter("heure_input");
		String nomEvent = request.getParameter("nom_event_input");
		String typeEvent = request.getParameter("type_input");
		String detailEvent = request.getParameter("infos_input");
		Date dateConvert = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.FRENCH);
		String dateEntiere = date+" "+heure;
		try {
			dateConvert = format.parse(dateEntiere);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		InputStream input = this.getServletContext().getResourceAsStream("WEB-INF/chemin.properties");
		prop.load(input);
		String chemin = prop.getProperty("mon_path_xml");
		GestionEvent.createEvent(chemin, idLieux, nomEvent, typeEvent, detailEvent, dateConvert);
		response.getWriter().write("ok");
		
	}
}
