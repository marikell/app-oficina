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
<title>Cadastro de pinturas</title>
</head>
<body>
	<div class="container mt-3">
		<h1>Cadastro de Pinturas: ${listagem.size()}</h1>

		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Código</th>
					<th>Valor</th>
					<th>Tipo de Pintura</th>
					<th>Tipo de massa aplicada</th>
					<th>Cor (Formato RGB)</th>
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
						<td>${item.tipoPintura}</td>
						<td>${item.tipoMassaAplicada}</td>
						<td>${item.cor}</td>
						<td><a href="/pintura/${item.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>