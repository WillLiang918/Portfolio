<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>JSP AJAX Form</title>
<script src="javascript/jquery-2.1.4.js"></script>
<script src="javascript/basic.js"></script>
<link rel="stylesheet" href="css/basic.css" type="text/css" media="screen" />
</head>
<body>
	<p class="Large">How to make AJAX calls using JSP & jQuery</p>
	<form id="updateUsername">
		<label for="username">What is your name?</label>
		<input type="text" id="username" name="username" /> 
		<input type="submit" />
	</form>
	<p id="displayName" />
	<br>
	<p class="small">Tutorial Resource HTTP blah blah blah</p>
</body>
</html>