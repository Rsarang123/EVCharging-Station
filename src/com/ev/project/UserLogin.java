package com.ev.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogin() {
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
		doGet(request, response);
		String uemail = request.getParameter("email");
		String upass = request.getParameter("password");
	
		try
		{
			
			Connection conn = ConnectJDBC.connect();
			PreparedStatement st2 = conn.prepareStatement("select * from user where Email=? and Password=?");
			st2.setString(1,uemail);
			st2.setString(2,upass);
			ResultSet rs = st2.executeQuery();
		    if(rs.next())
			{	
				response.sendRedirect("UIndex.html");
			}
		    else
		    {
		    	response.sendRedirect("404.html");
		    }
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
