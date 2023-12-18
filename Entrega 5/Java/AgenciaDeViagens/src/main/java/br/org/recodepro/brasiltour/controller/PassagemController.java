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

import br.org.recodepro.brasiltour.dao.PassagemDAO;
import br.org.recodepro.brasiltour.modelo.Passagem;

@Controller
@RequestMapping("/passagens")
public class PassagemController {

	@Autowired
	private PassagemDAO passagemDAO;

	@GetMapping
	public String listarPassagens(Model model) {
		List<Passagem> passagens = passagemDAO.findAll();
		model.addAttribute("passagens", passagens);

		return "list_passagens";
	}

	@GetMapping("/cadPassagem")
	public String cadPassagem(Model model) {
		return "cad_passagem";
	}

	@PostMapping
	public String criarPedido(@Validated Passagem passagem, Model model) {
		Passagem entity = passagemDAO.save(passagem);
		model.addAttribute("alerta", "Passagem " + entity.getNumPassagem() + " cadastrada com sucesso");

		return cadPassagem(model);
	}

	@PostMapping("/deletar/{id}")
	public String deleteById(@PathVariable("id") Integer numPassagem, Model model) {
		if (numPassagem != null) {
			Passagem passagem = passagemDAO.findById(numPassagem).orElseGet(null);
			if (passagem != null) {
				passagemDAO.delete(passagem);
				model.addAttribute("alerta",
						"Passagem de número: " + passagem.getNumPassagem() + " deletada com sucesso!");
			}
		}

		return listarPassagens(model);
	}

}
