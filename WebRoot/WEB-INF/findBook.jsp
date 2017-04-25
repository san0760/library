<%@page import="com.library.domain.Student"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.library.domain.Bookinfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	Student s=(Student)request.getSession().getAttribute("student");
	Date d=new Date();
	List bookList=(List)request.getAttribute("bookList");
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
 %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图书管理系统-检索图书</title>
    
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
	<table width="100%"><tr><td width="33%">检索图书&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;欢迎你：${student.name}</td><td width="33%"></td><td width="33%" align="right">今天是：<%=sdf.format(d) %>
  	<a href="/library/login.do?flag=logout">退出</a></td></tr></table>
    <hr>
    <a href="/library/jumpPage.do?flag=goUser">个人信息</a>&nbsp;&nbsp;&nbsp;<a href="/library/jumpPage.do?flag=goToBookBorrowed">当前借阅情况</a>&nbsp;&nbsp;&nbsp;<a href="/library/jumpPage.do?flag=goEdit">修改个人信息</a>
    &nbsp;&nbsp;&nbsp;<a href="/library/jumpPage.do?flag=goFindBook">检索图书</a><hr>
	<center><form action="/library/book.do?flag=findBook" method="post">
		检索字段：<input type="text" name="bookName"/>
		<input type="submit"/>
	</form><hr>
	<table>
		<tr><th>ISBN</th><th>书名</th><th>作者</th><th>出版社</th><th>类型</th><th>出版时间</th></tr>
		<%
			if(bookList!=null){
			for(int i=0;i<bookList.size();i++){
			Bookinfo bi=(Bookinfo)bookList.get(i);
		 %>
		 <tr><td><%=bi.getIsbn() %></td><td><%=bi.getName() %></td>
		 <td><%=bi.getAuthor() %></td><td><%=bi.getPublish() %></td>
		 <td><%=bi.getBooktypeinfo().getTypeName() %></td>
		 <td><%=sdf.format(bi.getPublishTime()) %></td></tr>
		 <%}} %>
	</table></center>
  </body>
</html>
