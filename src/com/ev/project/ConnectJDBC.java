package com.ev.project;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectJDBC 
{
		static Connection con = null;
		public static Connection connect()
		{
			try
			{
				if(con == null)
				{
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Loaded...");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/evcharging","root","");				
				}
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}
			return con;
		}
}
