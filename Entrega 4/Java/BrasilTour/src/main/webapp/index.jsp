<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BrasilTour</title>
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

    <div class="container" id="menu">
        <img src="imagens/Brasiltour.jpg" alt="BrasilTour" class="logo">
        <div class="text-home">
            <h1>Bem-vindo ao Brasil Tour!</h1>
            <p>Explore a diversidade e a riqueza cultural do Brasil conosco. Seja voc� um viajante �vido ou algu�m em busca de uma experi�ncia �nica, nosso site � o seu ponto de partida para descobrir os tesouros escondidos deste pa�s deslumbrante. Ent�o,
                embarque nesta aventura conosco. Desvende a magia do Brasil, deixe-se encantar por sua beleza estonteante e apaixone-se por sua gente calorosa. O Brasil Tour � o seu portal para descobrir o melhor que o Brasil tem a oferecer. Vamos juntos
                nesta jornada extraordin�ria!</p>
        </div>
    </div>

    <div class="footer_content_container">
        <div class="footer_content">
            <div class="contact">
                <h1>Ag�ncia Brasil Tour</h1>
                <p class="txt_md_white">contato@agenciabrasiltour.com</p>
                <p class="txt_md_white">(+55) 67 950505050</p>
            </div>
        </div>
    </div>

    <!-- Adicionar o script do Bootstrap no final do body para habilitar funcionalidades -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>

</html>