<!DOCTYPE html>
<html lang ="en">
<head>
    <meta charset="utf-8">
    <title>Reviews4Students</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="CSS/style2.css" rel="stylesheet" type="text/css">
    <script src="javascript/scripts.js"></script>
    <script src="javascript/jquery-3.3.1.min.js"></script>
    <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD0RylKM2JHep-8NBJmAwc8bUVraU4RRIE&callback=initMap"></script>
    <script src="javascript/scripts.js"></script>

  </head>


<style>
.error {
	color: red;
}

.col-centered{
float: none;
margin: 0 auto;
}
	.login-form {
		width: 340px;
    	margin: 50px auto;
	}
    .login-form form {
    	margin-bottom: 15px;
        background: #f7f7f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
    .login-form h2 {
        margin: 0 0 15px;
    }
    .form-control, .btn {
        min-height: 38px;
        border-radius: 2px;
    }
    .btn {        
        font-size: 15px;
        font-weight: bold;
    }
</style>
</head>


<body style="background-color: #4b5257">


<p>
<c:if test="${error == true}">
	<b class="error">Invalid login or password.</b>
</c:if>
<c:if test="${logout == true}">
	<b class="logout">You have been logged out.</b>
</c:if>
</p>

<div class="login-form">
	<h2 class="text-center">Log in</h2> 
	<c:url value="/login" var="loginUrl"/>
	<form action="${loginUrl}" method="post" modelAttribute="Employee">       
		<c:if test="${param.error != null}">        
			<p>
				Invalid username and password.
			</p>
		</c:if>
		<c:if test="${param.logout != null}">       
			<p>
				You have been logged out.
			</p>
		</c:if>
		
		<div class="form-group">
		<p>
			<label for="username">Username</label>
			<input type="text" class="form-control" id="username" name="username"/>	
		</p>
		</div>
		
		<div class="form-group">
		<p>
			<label for="password">Password</label>
			<input type="password" class="form-control" id="password" name="password"/>	
		</p>
		</div>
        <div class="custom-checkbox">
        <label><input type="checkbox"> Remember me</label>
     	 </div>
     	 
		<input type="hidden"                        
			name="${_csrf.parameterName}"
			value="${_csrf.token}"/>
		<button type="submit" class="btn-primary form-control">Log in</button>
	</form>	
</div>

</body>
</html>

  </html>
