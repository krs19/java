<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org" xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />


<style>


</style>

    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
	
	<body>
		<div>
			<div class="banner">
				<a class="title" th:href="@{/}">ITForum</a>
				<div sec:authorize="hasAuthority('ADMIN')" class="bannerButtons"><a th:href="@{/admin}">Admin</a></div>
				<div sec:authorize="isAnonymous()" class="bannerButtons"><a th:href="@{/register}">Register</a></div>
				<div sec:authorize="isAnonymous()" class="bannerButtons"><a th:href="@{/login}">Login</a></div>
			</div>
			
			<div class="formSection">
				<div class="form">
					<form method="POST" th:action="@{/register}" th:object="${user}">

						<input type="text" th:field="*{nick}" placeholder="nick" th:class="${#fields.hasErrors('nick')}? 'error' : 'text'"/>
						<input type="text" th:field="*{email}" placeholder="email" th:class="${#fields.hasErrors('email')}? 'error' : 'text'"/>
						<input type="password" th:field="*{password}" placeholder="password" th:class="${#fields.hasErrors('password')}? 'error' : 'text'"/>
							
						<input class="submit" type="submit" value = "register"/>
							
						<ul class="errors">
							<li th:each="err : ${#fields.errors('*')}" th:text="${err}">Validation error</li>	
						</ul>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>