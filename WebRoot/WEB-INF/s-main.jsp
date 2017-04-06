<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.library.domain.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	Student s=(Student)request.getSession().getAttribute("student");
	Date d=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	sdf.format(d);
 %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图书管理系统-个人信息</title>
    
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
  	<table width="100%"><tr><td width="33%">个人信息&nbsp;&nbsp;|&nbsp;&nbsp;欢迎你：${student.name}</td><td width="33%"></td><td width="33%" align="right">今天是：<%=sdf.format(d) %>
  	<a href="/library/login.do?flag=logout">退出</a></td></tr></table>
    <hr>
    <a href="/library/jumpPage.do?flag=goUser">个人信息</a>&nbsp;&nbsp;&nbsp;<a href="/library/jumpPage.do?flag=goToBookBorrowed">当前借阅情况</a>&nbsp;&nbsp;&nbsp;<a href="/library/jumpPage.do?flag=goEdit">修改个人信息</a><hr>
    学号：${student.studentId}<br>
    姓名：${student.name}<br>
    性别：${student.sex}<br>
    学院：${student.school}<br>
    专业班级：${student.classId}<br>
  </body>
</html>
