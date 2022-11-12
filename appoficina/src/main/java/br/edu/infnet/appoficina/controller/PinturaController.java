package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appoficina.model.domain.Pintura;
import br.edu.infnet.appoficina.model.domain.TipoMassaAplicada;
import br.edu.infnet.appoficina.model.domain.TipoPintura;
import br.edu.infnet.appoficina.service.PinturaService;

@Controller
public class PinturaController {

	private final String listaRota = "/pintura/lista";
	private final String exclusaoRota = "/pintura/{id}/excluir";
	private final String rotaBase = "/pintura";
	private final String inclusaoRota = "/pintura/incluir";
	private final String cadastroRota = "pintura/cadastro";
	@Autowired
	private PinturaService pinturaService;

	@GetMapping(value = listaRota)
	public String telaLista(Model model) {
		model.addAttribute("listagem", pinturaService.obterLista());

		return listaRota;
	}

	@GetMapping(value = exclusaoRota)
	public String exclusao(@PathVariable Integer id) {

		pinturaService.excluir(id);

		return "redirect:" + listaRota;
	}

	@GetMapping(value = rotaBase)
	public String telaCadastro(Model model) {

		TipoMassaAplicada[] tiposMassaAplicada = TipoMassaAplicada.values();
		TipoPintura[] tiposPintura = TipoPintura.values();

		model.addAttribute("tiposMassaAplicada", tiposMassaAplicada);
		model.addAttribute("tiposPintura", tiposPintura);

		return cadastroRota;
	}

	@PostMapping(value = inclusaoRota)
	public String incluir(Pintura pintura) {

		pinturaService.incluir(pintura);

		return "redirect:" + listaRota;
	}
}
