<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>

<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css"></link>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css"></link>

<!--  Google Font -->
<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


</head>
<body>
	
	<div class="sidebar">
			<tiles:insertAttribute name="sidebar" />
	</div>
		
	<div class="flex">
		<div class="sidebar2"></div>
		<div class="content">
			<tiles:insertAttribute name="content" />
		</div>
	</div>
</body>
</html>
