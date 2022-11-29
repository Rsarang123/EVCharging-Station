<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import ="java.sql.*" %>
<%@page import ="com.ev.project.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Account</title>
</head>
<body>
<%
int id = Integer.parseInt(request.getParameter("id"));
try
{
	Connection conn = ConnectJDBC.connect();
	PreparedStatement st2 = conn.prepareStatement("delete from charstation where StationID=?");
	st2.setInt(1,id);
	int res = st2.executeUpdate();
	if(res>0)
	{
		System.out.println("Account Is Deleted");
		response.sendRedirect("AdminView.jsp");
	}
	else
	{
		System.out.println("Failed To Delete");
		response.sendRedirect("404.html");
	}
}
catch(Exception e)
{
	System.out.println(e);
	e.printStackTrace();
}

%>
</body>
</html>