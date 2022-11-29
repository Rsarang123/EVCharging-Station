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
 * Servlet implementation class UpdatePower
 */
public class UpdatePower extends HttpServlet {
	int newpow=0;
	int opow,npow;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePower() {
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
		
		npow = Integer.parseInt(request.getParameter("cspow"));
		
		System.out.println("hello");
		try
	    {
		    Connection conn = ConnectJDBC.connect();
		    PreparedStatement ps = conn.prepareStatement("select Power from charstation where Mobile=?");
		    ps.setString(1,GetSet.getUsermo());
		
	        ResultSet rs  = ps.executeQuery();
	        while(rs.next())
	        {
	        	opow=rs.getInt("Power");
	        }
	        newpow= opow+npow;
	     
	        PreparedStatement ps1 = conn.prepareStatement("update charstation set Power=? where Mobile=?");
			ps1.setInt(1, newpow);
		    ps1.setString(2,GetSet.getUsermo());
		 
		    int i = ps1.executeUpdate();
		    
		    if(i<0)
	        {
		    	 
				 response.sendRedirect("404.html");
	        }
	        else
	        {
		       
		        response.sendRedirect("CSAdd.html");
	        }
	    }
		catch(Exception e)
	    {
		    System.out.println(e);
		    e.printStackTrace();
	    }	
	}

}
