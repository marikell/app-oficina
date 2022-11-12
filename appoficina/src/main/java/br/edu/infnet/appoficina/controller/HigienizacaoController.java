package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appoficina.model.domain.Higienizacao;
import br.edu.infnet.appoficina.model.domain.TipoHigienizacao;
import br.edu.infnet.appoficina.model.domain.TipoLimpeza;
import br.edu.infnet.appoficina.service.HigienizacaoService;
import br.edu.infnet.appoficina.service.OficinaService;

@Controller
public class HigienizacaoController {

	private final String listaRota = "/higienizacao/lista";
	private final String exclusaoRota = "/higienizacao/{id}/excluir";
	private final String rotaBase = "/higienizacao";
	private final String inclusaoRota = "/higienizacao/incluir";
	private final String cadastroRota = "higienizacao/cadastro";
	
	@Autowired
	private HigienizacaoService higienizacaoService;
	
	@Autowired
	private OficinaService oficinaService;

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
	
	@GetMapping(value = rotaBase)
	public String telaCadastro(Model model) {
		
		TipoHigienizacao[] tiposHigienizacao = TipoHigienizacao.values();
		TipoLimpeza[] tiposLimpeza = TipoLimpeza.values();
		
		model.addAttribute("oficinas", oficinaService.obterLista());
		model.addAttribute("tiposHigienizacao", tiposHigienizacao);
		model.addAttribute("tiposLimpeza", tiposLimpeza);

		return cadastroRota;
	}
	
	@PostMapping(value = inclusaoRota)
	public String incluir(Higienizacao higienizacao) {

		higienizacaoService.incluir(higienizacao);

		return "redirect:" + listaRota;
	}
}
