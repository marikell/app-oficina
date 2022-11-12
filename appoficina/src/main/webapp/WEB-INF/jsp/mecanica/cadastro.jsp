<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Mecânicas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Cadastro de Mecânica</h2>
		<form action="/mecanica/incluir" method="post">
			<div class="form-group">
				<label>Oficina:</label> <select name="oficina" class="form-control">
					<c:forEach var="s" items="${oficinas}">
						<option value="${s.id}">${s.nome}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label>Placa:</label> <input type="text" class="form-control"
					id="placa" name="placa">
			</div>
			<div class="form-group">
				<label>Tipo Manutenção:</label> <select name="tipoManutencao"
					class="form-control">
					<c:forEach var="tipoManutencao" items="${tiposManutencao}">
						<option value="${tipoManutencao}">${tipoManutencao.name}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Tipo Veículo:</label> <select name="tipoVeiculo"
					class="form-control">
					<c:forEach var="tipoVeiculo" items="${tiposVeiculo}">
						<option value="${tipoVeiculo}">${tipoVeiculo.name}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Valor:</label> <input type="number" class="form-control"
					id="valor" name="valor" step="0.01">
			</div>

			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>

	</div>
</body>
</html>