<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de oficinas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h1>Cadastro de Oficinas: ${listagem.size()}</h1>
		<h4>
			<a href="/oficina">Nova oficina</a>
		</h4>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>CEP</th>
					<th>Logradouro</th>
					<th>Complemento</th>
					<th>Bairro</th>
					<th>Localidade</th>
					<th>UF</th>
					<th>Gerente</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${listagem}">
					<tr>
						<td>${item.id}</td>
						<td>${item.nome}</td>
						<td>${item.endereco.cep}</td>
						<td>${item.endereco.logradouro}</td>
						<td>${item.endereco.complemento}</td>
						<td>${item.endereco.bairro}</td>
						<td>${item.endereco.localidade}</td>
						<td>${item.endereco.uf}</td>
						<td>${item.gerente.nome}</td>
						<td><a href="/oficina/${item.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>