<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br><br>
${error}
<c:url value="/j_spring_security_check" var="login"></c:url>
<form action="${login }" method="post">
Enter username <input type="text" name="j_username"><br>
Enter password <input type="password" name="j_password"><br>
<input type="submit" value="Login">
</form>
</body>
</html>
