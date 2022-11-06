package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appoficina.service.GerenteService;

@Controller
public class GerenteController  {	
	private final String listaRota = "/gerente/lista";
	private final String exclusaoRota = "/gerente/{id}/excluir";
	
	@Autowired
	private GerenteService gerenteService;

	@GetMapping(value = listaRota)
	public String telaLista(Model model) {
		model.addAttribute("listagem", gerenteService.obterLista());

		return listaRota;
	}
	
	@GetMapping(value = exclusaoRota)
	public String exclusao(@PathVariable Integer id) {

		gerenteService.excluir(id);
		
		return "redirect:" + listaRota;
	}
}

