<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Cadastro de Mecânicas</title>
</head>
<body>
	<div class="container mt-3">
		<h1>Cadastramento de Mecânicas: ${listagem.size()}</h1>

		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Código</th>
					<th>Valor</th>
					<th>Tipo de Manutenção</th>
					<th>Placa</th>
					<th>Tipo de Veículo</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${listagem}">
					<tr>
						<td>${item.id}</td>
						<td>${item.nome}</td>
						<td>${item.codigo}</td>
						<td>${item.valor}</td>
						<td>${item.tipoManutencao}</td>
						<td>${item.placa}</td>
						<td>${item.tipoVeiculo}</td>
						<td><a href="/mecanica/${item.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>