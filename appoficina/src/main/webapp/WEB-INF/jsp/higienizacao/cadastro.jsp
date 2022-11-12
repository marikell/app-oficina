<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Higienizações</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Cadastro de Higienização</h2>
		<form action="/higienizacao/incluir" method="post">
			<div class="form-group">
				<label>Tipo Limpeza:</label> <select name="tipoLimpeza"
					class="form-control">
					<c:forEach var="tipoLimpeza" items="${tiposLimpeza}">
						<option value="${tipoLimpeza}">${tipoLimpeza.name}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Tipo Higienização:</label> <select name="tipoHigienizacao"
					class="form-control">
					<c:forEach var="tipoHigienizacao" items="${tiposHigienizacao}">
						<option value="${tipoHigienizacao}">${tipoHigienizacao.name}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-check form-switch">
				<input class="form-check-input" type="checkbox"
					id="necessarioArmazenamentoItensVeiculo"
					name="necessarioArmazenamentoItensVeiculo" value="yes" checked>
				<label class="form-check-label"
					for="necessarioArmazenamentoItensVeiculo">É necessário
					armazenar os itens do carro no armário?:</label>
			</div>

			<div class="form-group">
				<label>Valor:</label> 
				<input type="number"
					class="form-control" id="valor" name="valor" step="0.01">
			</div>

			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>

	</div>
</body>
</html>