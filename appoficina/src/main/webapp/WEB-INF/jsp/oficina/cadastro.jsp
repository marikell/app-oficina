<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Oficinas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Cadastro de Oficina</h2>
		<form action="/oficina/cep" class="form-inline" method="post">

			<div class="form-group">
				<label>CEP:</label> <input type="text" class="form-control"
					placeholder="Entre com o seu CEP" name="cep">
			</div>

			<button type="submit" class="btn btn-default">Buscar</button>
		</form>
		<form action="/oficina/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> <input type="text" class="form-control"
					id="nome" name="nome">
			</div>

			<div class="form-group">
				<label>Gerente:</label> <select name="gerente" class="form-control">
					<c:forEach var="s" items="${gerentes}">
						<option value="${s.id}">${s.nome}</option>
					</c:forEach>
				</select>
			</div>

			<c:import url="/WEB-INF/jsp/endereco.jsp" />

			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>

	</div>
</body>
</html>