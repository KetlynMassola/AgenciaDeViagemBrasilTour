<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário de Contato - Agência de Viagem</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
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
        <h1><strong>Brasiltour</strong></h1>
        <p><strong>Cadastro de Pedido</strong></p>
        
        <%-- Verifique se o param "alerta" existe na url --%>
        <c:if test="${not empty param.alerta}">
            <div class="alert alert-success alert-dismissible fade show" role="alert">
                ${param.alerta}
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>
        </c:if>

        <div class="container main-content">
            <form method="post" action="/BrasilTour/pedidos">
                <label for="data_viagem" class="form-label"><strong>Data:</strong></label>
                <input type="text" id="data_viagem" name="data_viagem" required class="form-control"><br>

                <label for="forma_pgto" class="form-label"><strong>Forma de pagamento:</strong></label>
                <input type="text" id="forma_pgto" name="forma_pgto" required class="form-control"><br>

                <label for="valor_pgto" class="form-label"><strong>Valor:</strong></label>
                <input type="number" step="0.01" id="valor_pgto" name="valor_pgto" required class="form-control"><br>

                <label for="cpf_passageiro" class="form-label"><strong>CPF do Passageiro:</strong></label>
                <input type="text" id="cpf_passageiro" name="cpf_passageiro" required class="form-control"><br>

                <input type="submit" class="btn btn-primary" value="Enviar">
            </form>
        </div>
    </div>
    <!-- Adicionar o script do Bootstrap no final do body para habilitar funcionalidades -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>

</html>