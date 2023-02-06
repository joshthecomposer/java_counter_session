<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/script/script.js" defer></script>
<title>Counter</title>
</head>

<body>
	<div class="container col-8 bg-light rounded d-flex flex-column justify-content-center align-items-center my-5 py-5">
		<h1>Times You've Visited</h1>
		<h1 class="display-1"><c:out value="${count}" /></h1>
		<div>
			<a href="/counter" class="btn btn-primary btn-lg">Add 1</a>
			<a href="/counter/2" class="btn btn-primary btn-lg">Add 2</a>
			<a href="/clear" class="btn btn-danger btn-lg">Reset</a>
		</div>
	</div>
</body>
</html>