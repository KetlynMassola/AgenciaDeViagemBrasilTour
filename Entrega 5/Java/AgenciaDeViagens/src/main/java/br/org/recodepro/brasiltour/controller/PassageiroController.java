package br.org.recodepro.brasiltour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.org.recodepro.brasiltour.dao.PassageiroDAO;
import br.org.recodepro.brasiltour.modelo.Passageiro;

@Controller
@RequestMapping("/passageiros")
public class PassageiroController {

	@Autowired
	private PassageiroDAO passageiroDAO;

	@GetMapping
	public String listarPassageiros(Model model) {
		List<Passageiro> passageiros = passageiroDAO.findAll();
		model.addAttribute("passageiros", passageiros);

		return "list_passageiros";
	}

	@PostMapping("/deletar/{id}")
	public String deleteById(@PathVariable("id") String cpf, Model model) {
		if (cpf != null && cpf != "") {
			Passageiro passageiro = passageiroDAO.findById(cpf).orElseGet(null);
			if (passageiro != null) {
				// deletar passageiro
				passageiroDAO.delete(passageiro);
				model.addAttribute("alerta", "Passageiro de CPF " + cpf + " deletado com sucesso!");
			}
		}

		return listarPassageiros(model);
	}

	@GetMapping("/cadPassageiro")
	public String cadPassageiro(Model model) {
		return "cad_passageiro";
	}

	@PostMapping
	public String criarPassageiro(@Validated Passageiro passageiro, Model model) {
		Passageiro entity = passageiroDAO.save(passageiro);
		model.addAttribute("alerta", "Passageiro " + entity.getNome() + " cadastrado com sucesso");

		return cadPassageiro(model);
	}
}
