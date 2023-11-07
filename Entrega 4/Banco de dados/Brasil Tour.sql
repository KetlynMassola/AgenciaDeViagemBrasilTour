DROP DATABASE IF EXISTS brasil_tour;

CREATE DATABASE brasil_tour;

USE brasil_tour;

CREATE TABLE Passageiro (
    Nome varchar(255),
    CPF varchar (20) PRIMARY KEY,
    Telefone varchar (20),
    Email varchar (255)
);

CREATE TABLE Pedido (
    Num_pedido Int PRIMARY KEY auto_increment,
    Data_pedido varchar (20),
    Forma_pgto varchar(20),
    Valor_pgto float(7,2),
    CPF_passageiro varchar (20),
    FOREIGN KEY(CPF_passageiro) REFERENCES Passageiro(CPF)
);

CREATE TABLE Passagem (
    Num_passagem Int PRIMARY KEY auto_increment,
    Origem varchar(255),
    Destino varchar(255),
    Data_ida varchar(40),
    Data_volta varchar (40),
    Num_pedido Int,
    FOREIGN KEY(Num_pedido) REFERENCES Pedido(Num_pedido)
);
 