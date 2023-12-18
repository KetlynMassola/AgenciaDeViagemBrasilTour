package br.org.recodepro.brasiltour.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.recodepro.brasiltour.modelo.Pedido;

public interface PedidoDAO extends JpaRepository<Pedido, Integer> {
}
