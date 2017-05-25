package soa.jaxrslabs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soa.jaxrslabs.*;
import soa.jaxrslabs.billeterie.Categorie;
import soa.jaxrslabs.metier.GestionEvent;
/**
 * Servlet implementation class CreationLieu
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
    	// TODO Auto-generated method stub
    	PrintWriter out = resp.getWriter();
		out.println("bon");
    }
    
	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("bon");
	}

}
