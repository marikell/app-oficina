<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Gerente</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Gerente</h2>
	  <form action="/gerente/incluir" method="post">
	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
	    </div>
	    <div class="form-group">
	      <label>E-mail:</label>
	      <input type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
	    </div>
	    <div class="form-group">
	      <label>CPF:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu CPF" name="cpf">
	    </div>
	    <div class="form-group">
	      <label>Data de contrata��o:</label>
	      <input type="date" class="form-control" placeholder="Entre com o sua data de contrata��o" name="dataContratacao">
	    </div>
	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>

	</div>
</body>
</html>