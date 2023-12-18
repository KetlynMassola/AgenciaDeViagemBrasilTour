package br.org.recodepro.brasiltour.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.recodepro.brasiltour.modelo.Passageiro;

public interface PassageiroDAO extends JpaRepository<Passageiro, String> {
}
