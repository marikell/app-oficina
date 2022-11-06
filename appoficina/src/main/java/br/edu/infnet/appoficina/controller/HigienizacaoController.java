package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appoficina.service.HigienizacaoService;

@Controller
public class HigienizacaoController {

	private final String listaRota = "/higienizacao/lista";
	private final String exclusaoRota = "/higienizacao/{id}/excluir";

	@Autowired
	private HigienizacaoService higienizacaoService;

	@GetMapping(value = listaRota)
	public String telaLista(Model model) {
		model.addAttribute("listagem", higienizacaoService.obterLista());

		return listaRota;
	}
	
	@GetMapping(value = exclusaoRota)
	public String exclusao(@PathVariable Integer id) {

		higienizacaoService.excluir(id);
		
		return "redirect:" + listaRota;
	}
}
