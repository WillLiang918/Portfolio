<html>
<head>
<title>Login</title>
</head>

<body>
<h1>Login</h1>
<form action="UserLoginServlet" method="GET">
	<p>Email<br>
	<input type="text" name="email" placeholder="email" size="15" maxlength="20"/></p>
	<p>Password<br>
	<input type="password" name="password" placeholder="password" size="10" maxlength="20"/></p>
	<p>
		<input type="submit" name="submit" value="Login"/>
		<a href="ForgotPassword.jsp" title="AJAX!">
		 <button>Sign Up</button>
		</a>
	</p>
	
</form>
</body>
</html>