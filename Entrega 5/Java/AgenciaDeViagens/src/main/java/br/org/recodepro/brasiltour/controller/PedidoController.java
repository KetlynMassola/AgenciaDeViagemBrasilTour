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

import br.org.recodepro.brasiltour.dao.PedidoDAO;
import br.org.recodepro.brasiltour.modelo.Pedido;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoDAO pedidoDAO;

	@GetMapping
	public String listarPedidos(Model model) {
		List<Pedido> pedidos = pedidoDAO.findAll();
		model.addAttribute("pedidos", pedidos);

		return "list_pedidos";
	}

	@GetMapping("/cadPedido")
	public String cadPedido(Model model) {
		return "cad_pedido";
	}

	@PostMapping
	public String criarPedido(@Validated Pedido pedido, Model model) {
		Pedido entity = pedidoDAO.save(pedido);
		model.addAttribute("alerta", "Pedido " + entity.getNumPedido() + " cadastrado com sucesso");

		return cadPedido(model);
	}

	@PostMapping("/deletar/{id}")
	public String deleteById(@PathVariable("id") Integer numPedido, Model model) {
		if (numPedido != null) {
			Pedido pedido = pedidoDAO.findById(numPedido).orElseGet(null);
			if (pedido != null) {
				pedidoDAO.delete(pedido);
				model.addAttribute("alerta", "Pedido de número: " + pedido.getNumPedido() + " deletado com sucesso!");
			}
		}

		return listarPedidos(model);
	}

}
