<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>

<title><tiles:getAsString name="title" /></title>
  <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

    <!-- FontAwesome CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">

    <!-- ElegantFonts CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/elegant-fonts.css">

    <!-- themify-icons CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/themify-icons.css">

    <!-- Swiper CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/swiper.min.css">

    <!-- Styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
 
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


</head>
<body class="about-page">

	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
  <script type='text/javascript' src='${pageContext.request.contextPath}/js/jquery.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/js/swiper.min.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/js/masonry.pkgd.min.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/js/jquery.collapsible.min.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/js/custom.js'></script>
</body>
</html>
