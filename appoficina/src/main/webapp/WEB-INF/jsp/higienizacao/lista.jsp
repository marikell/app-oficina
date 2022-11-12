<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de higienizações</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h1>Cadastro de Higienizações: ${listagem.size()}</h1>
		  <h4><a href="/higienizacao">Nova higienização</a></h4>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Código</th>
					<th>Valor</th>
					<th>Tipo de Higienização</th>
					<th>Requer armazenamento de itens externos?</th>
					<th>Tipo de Limpeza</th>
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
						<td>${item.tipoHigienizacao.name}</td>
						<td>${item.necessarioArmazenamentoItensVeiculo}</td>
						<td>${item.tipoLimpeza.name}</td>
						<td>${item.oficina.nome}</td>
						<td><a href="/higienizacao/${item.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>