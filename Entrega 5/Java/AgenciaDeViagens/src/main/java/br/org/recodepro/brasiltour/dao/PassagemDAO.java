package br.org.recodepro.brasiltour.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.recodepro.brasiltour.modelo.Passagem;
import br.org.recodepro.brasiltour.modelo.Pedido;

public interface PassagemDAO extends JpaRepository<Passagem, Integer> {

	List<Passagem> findByPedido(Pedido pedido);
}
