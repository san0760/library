<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*,com.library.domain.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	Student s=(Student)request.getSession().getAttribute("student");
	Date d=new Date();
	SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
	sdf1.format(d);
	List<Borrowinfo> l=(List)request.getAttribute("borrowinfo");
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图书管理系统-当前借阅情况</title>
    
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
  	<a href="/library/jumpPage.do?flag=goUser">个人信息</a>&nbsp;&nbsp;&nbsp;<a href="/library/jumpPage.do?flag=goToBookBorrowed">当前借阅情况</a><hr>
	<table>
	<tr align="center"><td>最迟应归还时间</td><td>书名</td><td>图书类型</td><td>借期</td><td>续借</td></tr>
		<%
			for(int i=0;i<l.size();i++){
			Borrowinfo bi=(Borrowinfo)l.get(i);
		 %>
		 <tr align="center"><td><%=sdf.format(bi.getReturnTime()) %></td><td><%=bi.getBookinfo().getName() %></td><td><%=bi.getBookinfo().getBooktypeinfo().getTypeName() %></td><td><%=sdf.format(bi.getOutTime()) %></td>
		 <td><a href="/library/book.do?flag=conBook&opId=<%=bi.getOpId() %>">续借</a></td></tr>
		 <%} %>
	</table>
  </body>
</html>
