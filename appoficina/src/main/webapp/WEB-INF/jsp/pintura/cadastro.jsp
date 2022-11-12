<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Pinturas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Cadastro de Pintura</h2>
		<form action="/pintura/incluir" method="post">
			<div class="form-group">
				<label>Tipo de Pintura:</label> <select name="tipoPintura"
					class="form-control">
					<c:forEach var="tipoPintura" items="${tiposPintura}">
						<option value="${tipoPintura}">${tipoPintura.name}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Tipo de Massa Aplicada:</label> <select
					name="tipoMassaAplicada" class="form-control">
					<c:forEach var="tipoMassaAplicada" items="${tiposMassaAplicada}">
						<option value="${tipoMassaAplicada}">${tipoMassaAplicada.name}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Valor:</label> <input type="number" class="form-control"
					id="valor" name="valor" step="0.01">
			</div>

			<div class="form-group">
				<label>Cor da pintura:</label> <input type="color" id="corTexto"
					name="corTexto"><br> <br>

			</div>

			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>

	</div>
</body>
</html>