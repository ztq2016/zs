<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	程序发生了错误，有可能该页面正在调试或者是设计上的缺陷.<br/>  
你可以选择<br/> <a href=<%=request.getContextPath()+"/?userId=000001" %>>反馈</a>  
提醒我 或者<br/><a href="javascript:history.go(-1)">返回上一页</a>  
</body>
</html>