<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formul�rio de Contato - Ag�ncia de Viagem</title>
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
                    <li class="nav-item"><a href="promocao.jsp" class="nav-link">Promo��o</a></li>
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
        <p><strong>Preencha o formul�rio abaixo para entrar em contato conosco.</strong></p>

        <div class="container main-content">
            <form>
                <label for="nome" class="form-label"><strong>Nome:</strong></label>
                <input type="text" id="nome" name="nome" required class="form-control"><br>

                <label for="email" class="form-label"><strong>Email:</strong></label>
                <input type="email" id="email" name="email" required class="form-control"><br>

                <label for="telefone" class="form-label"><strong>Telefone:</strong></label>
                <input type="tel" id="telefone" name="telefone" required class="form-control"><br>

                <label for="mensagem" class="form-label"><strong>Mensagem:</strong></label><br>
                <textarea id="mensagem" name="mensagem" rows="4" cols="50" required class="form-control"></textarea><br>

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