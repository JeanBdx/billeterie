package soa.jaxrslabs.servlets;
import com.google.gson.Gson;

import soa.jaxrslabs.metier.GestionEvent;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoReservation
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestionEvent e = new GestionEvent();
		Properties prop = new Properties();
		InputStream input = this.getServletContext().getResourceAsStream("WEB-INF/classes/chemin.properties");
		prop.load(input);
		String chemin = prop.getProperty("mon_path_xml");
		String json = new Gson().toJson(e.getEvenements(chemin));
		response.setContentType( "application/json" );
		response.setCharacterEncoding( "UTF-8" );
		response.getWriter().write( new Gson().toJson( json ) );
					
	}

}
