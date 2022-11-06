package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appoficina.service.OficinaService;


@Controller
public class OficinaController {

	private final String listaRota = "/oficina/lista";
	private final String exclusaoRota = "/oficina/{id}/excluir";
	
	@Autowired
	private OficinaService oficinaService;

	@GetMapping(value = listaRota)
	public String telaLista(Model model) {
		model.addAttribute("listagem", oficinaService.obterLista());

		return listaRota;
	}
	
	@GetMapping(value = exclusaoRota)
	public String exclusao(@PathVariable Integer id) {

		oficinaService.excluir(id);
		
		return "redirect:" + listaRota;
	}
}
