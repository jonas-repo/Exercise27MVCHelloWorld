package com.exercise27mvchelloworld.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsuariosServlet
 */
@WebServlet("/UsuariosServlet")
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuariosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid="";
		String sname="";
		String sage="";
		
		sid = request.getParameter("txtNumber");
		sage = request.getParameter("txtAge");
		sname = request.getParameter("txtName");
		
		response.getWriter().append("El id introducido es: " +sid);
		response.getWriter().append("la edad introducida es: " +sage);
		response.getWriter().append("El nombre introducido es: "+sname);
		
	}

}
