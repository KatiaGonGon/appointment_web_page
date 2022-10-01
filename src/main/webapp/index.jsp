<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <link href="<c:url value="/css/headerAndFooter.css" />" rel="stylesheet">
	<title>KATIA</title>
	<link rel="icon" type="image/x-icon" href="<c:url value="/img/favicon.ico" />">
</head>
<body>

	<%@include file="head.jsp"%>
	
	<p>body text</p>
	
	<jsp:include page="footer.jsp" />
	
</body>
</html>