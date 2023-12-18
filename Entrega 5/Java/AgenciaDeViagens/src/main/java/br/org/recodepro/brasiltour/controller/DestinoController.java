package br.org.recodepro.brasiltour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/destinos")
public class DestinoController {

	@GetMapping
	public String pageDestinos(Model model) {
		return "destinos";
	}
}
