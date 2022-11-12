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
		<h1>Cadastro de Mecânicas: ${listagem.size()}</h1>
		<h4>
			<a href="/mecanica">Nova mecânica</a>
		</h4>
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
					<th>Oficina</th>
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
						<td>${item.tipoManutencao.name}</td>
						<td>${item.placa}</td>
						<td>${item.tipoVeiculo.name}</td>
						<td>${item.oficina.nome}</td>
						<td><a href="/mecanica/${item.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>