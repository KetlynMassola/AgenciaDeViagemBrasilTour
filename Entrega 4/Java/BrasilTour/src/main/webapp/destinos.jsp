<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Destinos da Ag�ncia de Viagem</title>
    <!-- Incluindo o Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
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
        <h1 class="text-center">Destinos BrasilTour</h1>

        <div class="row">
            <!-- Destino 1: Bonito Mato Grosso do Sul, Brasil -->
            <div class="col-lg-4 destino-card">
                <div class="card">
                    <img src="imagens/Bonito MS.jpeg" class="card-img-top" alt="Bonito Mato Grosso do Sul, Brasil">
                    <div class="card-body">
                        <h5 class="card-title">Bonito - Mato Grosso do Sul</h5>
                        <p class="card-text">Bonito � um munic�pio localizado no Estado de Mato Grosso do Sul, Brasil. Conhecido por suas �guas cristalinas e belezas naturais, � um destino ideal para os amantes do ecoturismo e aventura.</p>
                        <a href="#" class="btn btn-primary">Saiba mais</a>
                    </div>
                </div>
            </div>

            <!-- Destino 2: Imbituba Santa Caqtarina, Brasil -->
            <div class="col-lg-4 destino-card">
                <div class="card">
                    <img src="imagens/Imbituba SC.jpeg" class="card-img-top" alt="Imbituba Santa Catrina, Brasil">
                    <div class="card-body">
                        <h5 class="card-title">Imbituba - Santa Catarina</h5>
                        <p class="card-text">Imbituba � uma cidade localizada no litoral de Santa Catarina, Brasil. Conhecida por suas praias paradis�acas, � um destino perfeito para os amantes do surf e das belezas naturais do sul do pa�s.</p>
                        <a href="#" class="btn btn-primary">Saiba mais</a>
                    </div>
                </div>
            </div>

            <!-- Destino 3: Canoa Quebrada Cear�, Brasil -->
            <div class="col-lg-4 destino-card">
                <div class="card">
                    <img src="imagens/Canoa Quebrada CE.jpeg" class="card-img-top" alt="Canoa Quebrada Cear�, Brasil">
                    <div class="card-body">
                        <h5 class="card-title">Canoa Quebrada - Cear�</h5>
                        <p class="card-text">Canoa Quebrada � uma praia localizada no munic�pio de Aracati, no estado do Cear�, Brasil. Conhecida por suas fal�sias e mar cristalino, � um destino encantador para quem busca relaxar e aproveitar a natureza.</p>
                        <a href="#" class="btn btn-primary">Saiba mais</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Adicionar o script do Bootstrap no final do body para habilitar funcionalidades -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>

</html>