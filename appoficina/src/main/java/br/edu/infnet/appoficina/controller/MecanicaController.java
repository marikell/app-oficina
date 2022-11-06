package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appoficina.service.MecanicaService;

@Controller
public class MecanicaController {
	private final String listaRota = "/mecanica/lista";
	private final String exclusaoRota = "/mecanica/{id}/excluir";

	@Autowired
	private MecanicaService mecanicaService;

	@GetMapping(value = listaRota)
	public String telaLista(Model model) {
		model.addAttribute("listagem", mecanicaService.obterLista());

		return listaRota;
	}
	
	@GetMapping(value = exclusaoRota)
	public String exclusao(@PathVariable Integer id) {

		mecanicaService.excluir(id);
		
		return "redirect:" + listaRota;
	}
}
