package com.ev.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class UserRegister
 */
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegister() {
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
		String uname,mobno,uemail,pass,city;
		int id=0;
			
			uname = request.getParameter("Name");
			uemail = request.getParameter("Email");
			mobno = request.getParameter("Mobile");
			pass = request.getParameter("Password");
			city = request.getParameter("City");
			
			
			
			try
			{
				Connection conn = ConnectJDBC.connect();			
				PreparedStatement st = conn.prepareStatement("insert into user values(?,?,?,?,?,?)");
				st.setInt(1,id);
				st.setString(2,uname);
				st.setString(3,uemail);
				st.setString(4,mobno);
			
				st.setString(5,city);
				st.setString(6,pass);
;
				int i = st.executeUpdate();
				if(i>0){
					response.sendRedirect("Ulogin.html");
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
