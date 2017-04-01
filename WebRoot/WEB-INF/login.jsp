<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎-图书管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#CCCCCC">
  <a>登陆我的图书馆</a><hr>
	<center><form method="post" action="/library/login.do?flag=login">
		<table>
		<tr><td align="center" width="30%">学号:</td><td><input type="text" name="id"/></td></tr>
    	<tr><td align="center" width="30%">密码:</td><td><input type="password" name="password"/></td></tr>
    	<tr><td align="center" width="30%"><input type="submit" value="登录"/></td><td><input type="reset" value="清空"></td></tr>
    	</table>
	</center></form>
  </body>
</html>
