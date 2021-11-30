package com.coforge.training.shopstop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * Servlet implementation class HeeloWorld
 */
@WebServlet("/HeeloWorld")
public class HeeloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private String msg ;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeeloWorld() {
        super();
       msg="httpservlet demo";
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.println("<h1> hello world from servlet</h1>");
		out.println("<h3>"+msg+"</h3>");
		out.println("<p> web applications using servlet</p>");
	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
