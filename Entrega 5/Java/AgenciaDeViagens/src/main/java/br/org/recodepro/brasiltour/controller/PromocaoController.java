package br.org.recodepro.brasiltour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/promocoes")
public class PromocaoController {

	@GetMapping
	public String pagePromocoes(Model model) {
		return "promocoes";
	}
}
