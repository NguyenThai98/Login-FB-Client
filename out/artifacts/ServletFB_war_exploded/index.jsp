<%@page import="com.nguyenthai.loginfb.FBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%
  FBConnection fbConnection = new FBConnection();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Java Facebook Login</title>
</head>
<body style="text-align: center; margin: 0 auto;">
<div>

  <a href="<%=fbConnection.getFBAuthUrl()%>">  login fb
  </a>
</div>
</body>
</html>