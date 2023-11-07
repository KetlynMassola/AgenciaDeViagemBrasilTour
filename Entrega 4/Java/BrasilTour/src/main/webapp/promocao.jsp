<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ag�ncia Brasil Tour - Promo��es</title>
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
        <div class="promo-container">
            <h1 class="promo-title">Promo��o BrasilTour</h1>
        </div>
        <div class="row">
            <div class="col-lg-4 col-md-6 mb-4">
                <div class="card">
                    <img src="imagens/Bonito MS.jpeg" class="card-img-top" alt="Imagem Promo��o 1">
                    <div class="card-body">
                        <h5 class="card-title">Bonito - MS</h5>
                        <p class="card-text">Explore um dos destinos mais deslumbrantes do Brasil. Bonito � conhecido por suas �guas cristalinas, rios de cores �nicas e uma biodiversidade impressionante. O pacote inclui: 5 dias e 4 noites de hospedagem em uma pousada aconchegante.
                            Passeios imperd�veis, como flutua��o nos rios Sucuri e Rio da Prata, visitas �s grutas e cachoeiras locais. Alimenta��o inclusa: caf� da manh� e almo�o em alguns passeios. Guia tur�stico para acompanhamento nos passeios. .
                        </p>
                        <a href="imagens/Bonito MS.jpeg" class="btn " id="btt"> R$ 2.100</a>
                        <button class="btn btn-primary" id="btn-comprar">Comprar</button>
                    </div>
                </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
                <div class="card">
                    <img src="imagens/Imbituba SC.jpeg" class="card-img-top" alt="Imagem Promo��o 2">
                    <div class="card-body">
                        <h5 class="card-title">Imbituba - SC</h5>
                        <p class="card-text">Se voc� ama praias paradis�acas, Imbituba � o lugar certo para voc�. Com suas praias de areias brancas e �guas cristalinas, � um para�so para os amantes do mar. O pacote inclui: 6 dias e 5 noites de hospedagem em um resort � beira-mar.
                            Passeios pelas praias de Rosa, Ibiraquera e Vila, com oportunidades de surf e trilhas. Passeio de barco para avistar baleias (durante a temporada de avistamento). Alimenta��o inclusa: caf� da manh� e jantar no resort..</p>
                        <a href="imagens/Imbituba SC.jpeg" class="btn " id="btt">R$ 1.800</a>
                        <button class="btn btn-primary" id="btn-comprar">Comprar</button>
                    </div>
                </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
                <div class="card">
                    <img src="imagens/Canoa Quebrada CE.jpeg" class="card-img-top" alt="Imagem Promo��o 3">
                    <div class="card-body">
                        <h5 class="card-title">Canoa Quebrada - CE</h5>
                        <p class="card-text">Canoa Quebrada � uma charmosa vila de pescadores repleta de energia e cultura. Dunas, fal�sias e um p�r do sol inesquec�vel esperam por voc�. O pacote inclui: 4 dias e 3 noites de hospedagem em uma pousada acolhedora. Passeio de
                            buggy pelas dunas e fal�sias de Canoa Quebrada. Noite de luau com m�sica ao vivo e gastronomia regional. Alimenta��o inclusa: caf� da manh� na pousada.</p>
                        <a href="imagens/Canoa Quebrada CE.jpeg" class="btn " id="btt">R$ 2.800</a>
                        <button class="btn btn-primary" id="btn-comprar">Comprar</button>
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