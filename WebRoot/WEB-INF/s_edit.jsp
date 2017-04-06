<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*,com.library.domain.*" pageEncoding="utf-8"%>
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
    
    <title>图书管理系统-修改个人信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">  
                    function validate_channel_info(form)  
                    {  
                        if(form.psw2.value==""&form.psw1.value==""&form.email.value==""){
                        	alert("请输入数据");
                            return false;
                        }
                        if(form.psw2.value!=form.psw1.value)  
                        {  
                            alert("两次密码不一致，请重新输入");
                            return false;  
                        }  
                        else 
                        {  
                            alert("修改成功");
                            return true;  
                        }
                    }   
                   
                      
                </script>  
  </head>
  
  <body bgcolor="#CCCCCC">
  <table width="100%"><tr><td width="33%">修改个人信息&nbsp;&nbsp;|&nbsp;&nbsp;欢迎你：${student.name}</td><td width="33%"></td><td width="33%" align="right">今天是：<%=sdf.format(d) %>
	<a href="/library/login.do?flag=logout">退出</a></td></tr></table>
    <hr>
    <a href="/library/jumpPage.do?flag=goUser">个人信息</a>&nbsp;&nbsp;&nbsp;<a href="/library/jumpPage.do?flag=goToBookBorrowed">当前借阅情况</a>&nbsp;&nbsp;&nbsp;<a href="/library/jumpPage.do?flag=goEdit">修改个人信息</a><hr>
    <form name="form" method="post" action="/library/student.do?flag=editInfo" onsubmit="return validate_channel_info(this);">
    	修改密码(不需要修改请留空)<br>
    	新密码：<input type="password" name="psw1"><br>
    	确认新密码：<input type="password" name="psw2"><hr>
    	修改邮箱(不需要修改请留空)：<input type="text" name="email"><br>
    	<input type="submit" value="确认修改">
    </form>
  </body>
</html>
