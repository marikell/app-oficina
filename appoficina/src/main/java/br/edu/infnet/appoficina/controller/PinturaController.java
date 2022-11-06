package br.edu.infnet.appoficina.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appoficina.service.PinturaService;

@Controller
public class PinturaController {

	private final String listaRota = "/pintura/lista";
	private final String exclusaoRota = "/pintura/{id}/excluir";

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
}
