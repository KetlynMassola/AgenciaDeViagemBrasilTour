Algoritmo "AgenciaDeViagensBrasilTour"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Descri��o    : O algoritmo tem a capacidade de realizar o cadastro de clientes e destinos e consultar todos os clientes e destinos cadastrados.
// Autora       : Ketlyn Roxane Massola
// Professor    : Marcelo Vasques
// Data         : 04/08/2023

// imut�vel
const
    MAX_CLIENTES = 3
    MAX_DESTINOS = 3

// vari�veis - os valores podem mudar
Var
    i: inteiro
    opcao: inteiro
    numClientes: inteiro
    numDestinos: inteiro
    clienteSelecionado: inteiro

    // [0, 1, 2]
    listaDeClientes: vetor [0.. MAX_CLIENTES] de caracter
    // [0, 1, 2]
    listaDeDestinos: vetor [0.. MAX_DESTINOS] de caracter


//Procedimento que cadastra o cliente
procedimento cadastrarCliente
inicio
    escreval("Entrou no cadastrarCliente")
    se numClientes < MAX_CLIENTES ent�o
        escreval("Digite o nome do cliente: ")
        leia(listaDeClientes[numClientes])
        numClientes <- numClientes + 1
        escreval("Cliente cadastrado com sucesso!")
    sen�o
        escreval("Limite m�ximo de clientes atingido.")
    fimse

fimprocedimento

//Procedimento que cadastra o destino
procedimento cadastrarDestino
inicio
    se numDestinos < MAX_DESTINOS ent�o
        escreval("Digite o nome do destino: ")
        leia(listaDeDestinos[numDestinos])
        numDestinos <- numDestinos + 1
        escreval("Destino cadastrado com sucesso!")
        escreval("")
    sen�o
        escreval("Limite m�ximo de destinos atingido.")
    fimse

fimprocedimento

//Procedimento que consulta os clientes
procedimento consultarClientes
inicio
    escreval("Clientes cadastrados:")
    se numClientes > 0 ent�o
        para i de 0 ate numClientes - 1 passo 1 faca
            escreval("Cliente", i + 1, ": ", listaDeClientes[i])
        fimpara
    sen�o
        escreval("Nenhum cliente cadastrado.")
    fimse
fimprocedimento

//Procedimento que consulta os destinos
procedimento consultarDestinos
inicio
escreval("Destinos cadastrados:")
    se numDestinos > 0 ent�o
        para i de 0 ate numDestinos - 1 passo 1 faca
            escreval("Destino", i + 1, ": ", listaDeDestinos[i])
        fimpara
    sen�o
        escreval("Nenhum destino cadastrado.")
    fimse
fimprocedimento


// In�cio do c�digo de fato
Inicio
    numClientes <- 0
    numDestinos <- 0


    repita
        escreval("---------------------")
        escreval("MENU")
        escreval("Ag�ncia de Viagens - BrasilTour")
        escreval("---------------------")
        escreval("1. Cadastrar cliente")
        escreval("2. Cadastrar destino")
        escreval("3. Consultar clientes")
        escreval("4. Consultar destinos")
        escreval("5. Sair")
        escreval("---------------------")
        escreval("Digite a op��o desejada: ")
        leia(opcao)

        escolha (opcao)
            caso 1
                cadastrarCliente
            caso 2
                cadastrarDestino
            caso 3
                consultarClientes
            caso 4
                consultarDestinos
            caso 5
                escreval("Saindo")
            outrocaso
                escreval("Op��o inv�lida.")
        fimescolha
     ate opcao = 5

Fimalgoritmo
