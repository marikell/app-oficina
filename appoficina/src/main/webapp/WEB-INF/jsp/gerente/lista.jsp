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
<title>Cadastro de gerente</title>
</head>
<body>
	<div class="container mt-3">
		<h1>Cadastro de Gerentes: ${listagem.size()}</h1>

		<table class="table">
			<thead>
				<tr>
				    <th>ID</th>
					<th>Nome</th>
					<th>CPF</th>
					<th>E-mail</th>
					<th>Data de contratação</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${listagem}">
					<tr>
					    <td>${item.id}</td>
						<td>${item.nome}</td>
						<td>${item.cpf}</td>
						<td>${item.email}</td>
						<td>${item.ObterDataContratacaoFormatado()}</td>
						<td><a href="/gerente/${item.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>