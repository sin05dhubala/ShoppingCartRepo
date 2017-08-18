<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head><br><br><br>
<body>
<b>Details about the Product</b>
<table>
<tr>
<td>Product Name:</td><td>${product.productName }</td>
</tr>

<tr>
<td>Price:</td><td>${product.price }</td>
</tr>
<tr>
<td>Description:</td><td>${product.description }</td>
</tr>
<tr>
<td>Quantity:</td><td>${product.quantity }</td>
</tr>
</table>

<c:if  test="${product.quantity==0 }">
Out Of Stock
</c:if>

<c:if test="${product.quantity!=0 }">
<c:url value="/cart/addtocart/${product.id }" var="url"></c:url>
<form action="${url}">
Enter Units<input  type="text" name="units"><br>

<button type="submit" 
 style="background:none;border:none;padding:0" class="btn btn-default btn-lg">
<span class="glyphicon glyphicon-shopping-cart"></span></button>
</form>
</c:if>



<c:url value="/all/addproduct/viewproduct" var="url1"></c:url>
<a href="${url1}">Back to product list</a>
<br>
</body>
</html>