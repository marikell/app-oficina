package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appoficina.model.domain.Higienizacao;
import br.edu.infnet.appoficina.model.domain.Mecanica;
import br.edu.infnet.appoficina.model.domain.TipoHigienizacao;
import br.edu.infnet.appoficina.model.domain.TipoLimpeza;
import br.edu.infnet.appoficina.model.domain.TipoManutencao;
import br.edu.infnet.appoficina.model.domain.TipoVeiculo;
import br.edu.infnet.appoficina.service.MecanicaService;

@Controller
public class MecanicaController {
	private final String listaRota = "/mecanica/lista";
	private final String exclusaoRota = "/mecanica/{id}/excluir";
	private final String rotaBase = "/mecanica";
	private final String inclusaoRota = "/mecanica/incluir";
	private final String cadastroRota = "mecanica/cadastro";
	
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
	
	@GetMapping(value = rotaBase)
	public String telaCadastro(Model model) {
		
		TipoManutencao[] tiposManutencao = TipoManutencao.values();
		TipoVeiculo[] tiposVeiculo = TipoVeiculo.values();

		model.addAttribute("tiposManutencao", tiposManutencao);
		model.addAttribute("tiposVeiculo", tiposVeiculo);

		return cadastroRota;
	}
	
	@PostMapping(value = inclusaoRota)
	public String incluir(Mecanica mecanica) {

		mecanicaService.incluir(mecanica);

		return "redirect:" + listaRota;
	}
}
