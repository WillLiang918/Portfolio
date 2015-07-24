<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>My Account</title>
<script src="../javascript/jquery-2.1.4.js"></script>
<script src="portfolio.js"></script>
<link rel="stylesheet" href="../css/basic.css" type="text/css" media="screen" />
</head>
<body>
	<p class="Large">My Portfolio</p>
	<form id="updatePortfolio">
		<label for="depositAmt">Deposit Amount</label>
		<input type="text" id="depositAmt" name="depositAmt"/> 
		<br/>
		<label for="withdrawAmt">Withdraw Amount</label>
		<input type="text" id="withdrawAmt" name="withdrawAmt" /> 
		<br/>
		<input type="submit" />
	</form>
	<p id="displayName" />
	<br>
	<p class="small">Tutorial Resource HTTP blah blah blah</p>
</body>
</html>