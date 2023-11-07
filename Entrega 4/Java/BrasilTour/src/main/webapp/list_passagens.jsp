<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Lista de pedidos</title>
<!-- Incluindo o Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<!-- Estilos personalizados -->
<link rel="stylesheet" href="style.css">
</head>
<body>
	<!-- Container do menu usando Bootstrap -->
    <nav class="navbar navbar-expand-md navbar-dark bg-dark">
        <div class="container">
            <a href="index.jsp" class="navbar-brand">BrasilTour</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarMenu">
            <span class="navbar-toggler-icon"></span>
        </button>
            <div class="collapse navbar-collapse" id="navbarMenu">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item"><a href="index.jsp" class="nav-link">Home</a></li>
                    <li class="nav-item"><a href="destinos.jsp" class="nav-link">Destino</a></li>
                    <li class="nav-item"><a href="promocao.jsp" class="nav-link">Promoção</a></li>
                    <li class="nav-item"><a href="contato.jsp" class="nav-link">Contato</a></li>
                    <li class="nav-item dropdown">
                    	<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
				            Passageiro
				        </a>
				        <ul class="dropdown-menu">
				            <li><a class="dropdown-item" href="passageiros">Listar</a></li>
				            <li><a class="dropdown-item" href="cad_passageiro.jsp">Cadastrar</a></li>
				        </ul>
                    </li>
                    <li class="nav-item dropdown">
                    	<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
				            Pedido
				        </a>
				        <ul class="dropdown-menu">
				            <li><a class="dropdown-item" href="pedidos">Listar</a></li>
				            <li><a class="dropdown-item" href="cad_pedido.jsp">Cadastrar</a></li>
				        </ul>
                    </li>
                    <li class="nav-item dropdown">
                    	<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
				            Passagem
				        </a>
				        <ul class="dropdown-menu">
				            <li><a class="dropdown-item" href="passagens">Listar</a></li>
				            <li><a class="dropdown-item" href="cad_passagem.jsp">Cadastrar</a></li>
				        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
	<div class="container">
		<h1 class="text-center">Lista de pedidos</h1>

		<%-- Verifique se o param "alerta" existe na url --%>
        <c:if test="${not empty param.alerta}">
            <div class="alert alert-success alert-dismissible fade show" role="alert">
                ${param.alerta}
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>
        </c:if>

		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th scope="col">Núm</th>
					<th scope="col">Origem</th>
					<th scope="col">Destino</th>
					<th scope="col">Data Ida</th>
					<th scope="col">Data Volta</th>
					<th scope="col">Núm do Pedido</th>
					<th scope="col">Ações</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${passagens}" var="passagem">
					<tr>
						<td scope="row">${passagem.numPassagem}</td>
						<td>${passagem.origem}</td>
						<td>${passagem.destino}</td>
						<td>${passagem.dataIda}</td>
						<td>${passagem.dataVolta}</td>
						<td>${passagem.numPedido}</td>
						<td>
		                    <form action="/BrasilTour/passagens?delete=${passagem.numPassagem}" method="post">
		                        <button type="submit" class="btn btn-danger">Excluir</button>
		                    </form>
		                </td>
					</tr>
				</c:forEach>
			<tbody>
		</table>
	</div>

	<!-- Adicionar o script do Bootstrap no final do body para habilitar funcionalidades -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>