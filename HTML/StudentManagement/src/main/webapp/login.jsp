

<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>User Login</title>

</head>

<body>

<script>

	function loginUser(){

		var password = document.getElementById("password").value;

		var email = document.getElementById("email").value;

		var userData= localStorage.getItem("id_"+email);

		if(userData){

				var user = JSON.parse(userData);

				if(user.password===password){

					alert("Logged In");

				}else{

					alert("Wrong password");

				}

		}else{

			alert("User Not found");

		}

	}

</script>

	<h1>Login Page</h1>

		<form onsubmit="loginUser(); return false;">

			E-mail:<input type="email" id="email" required/>

			Password:<input type="password" id="password" required/>

			<input type="submit" value="Register"/>

		</form>

		<p>Not Registered ?<a href="register.jsp">Register</a></p>

</body>

</html>