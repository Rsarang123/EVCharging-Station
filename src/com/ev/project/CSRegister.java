package com.ev.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CSRegister
 */
public class CSRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CSRegister() {
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
		String uname,mobno,pass,add,city,taluka,district,open,close;
		int id=0,power,lat,lon;
		String status="Pending";
			uname = request.getParameter("Name");
			add = request.getParameter("Address");
			city = request.getParameter("City");
			taluka = request.getParameter("Taluka");
			district = request.getParameter("District");
			open = request.getParameter("OTime");
			close = request.getParameter("CTime");
			mobno = request.getParameter("Mobile");
			lat = Integer.parseInt(request.getParameter("Lantitude"));
			lon = Integer.parseInt(request.getParameter("Longitude"));
			pass = request.getParameter("Password");
			power = Integer.parseInt(request.getParameter("Power"));
			//status = request.getParameter("Status");
			
			
			try
			{
				Connection conn = ConnectJDBC.connect();			
				PreparedStatement st = conn.prepareStatement("insert into charstation values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				st.setInt(1,id);
				st.setString(2,uname);
				st.setString(3,add);
				st.setString(4,city);
				st.setString(5,taluka);
				st.setString(6,district);
				st.setString(7,open);
				st.setString(8,close);
				st.setString(9,mobno);
				st.setInt(10,lat);
				st.setInt(11,lon);
				st.setString(12,pass);
				st.setInt(13,power);
				st.setString(14, status);
				int i = st.executeUpdate();
				if(i>0){
					
					GetSet.setUsermo(mobno);
					response.sendRedirect("CSlogin.html");
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


