package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appoficina.service.ServicoService;

@Controller
public class ServicoController {

	private final String listaRota = "/servico/lista";
	private final String exclusaoRota = "/servico/{id}/excluir";
	
	@Autowired
	private ServicoService servicoService;

	@GetMapping(value = listaRota)
	public String telaLista(Model model) {
		model.addAttribute("listagem", servicoService.obterLista());

		return listaRota;
	}
	
	@GetMapping(value = exclusaoRota)
	public String exclusao(@PathVariable Integer id) {

		servicoService.excluir(id);
		
		return "redirect:" + listaRota;
	}
}
