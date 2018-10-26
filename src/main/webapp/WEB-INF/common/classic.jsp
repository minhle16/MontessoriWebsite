<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>

<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"></link>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


</head>
<body>

	<tiles:insertAttribute name="header" />

	<section>
		<tiles:insertAttribute name="navigator" />
		<tiles:insertAttribute name="body" />
	</section>

	<tiles:insertAttribute name="footer" />

</body>
</html>
