package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appoficina.model.domain.Oficina;
import br.edu.infnet.appoficina.model.domain.Usuario;
import br.edu.infnet.appoficina.service.CepService;
import br.edu.infnet.appoficina.service.GerenteService;
import br.edu.infnet.appoficina.service.OficinaService;

@Controller
public class OficinaController {

	private final String listaRota = "/oficina/lista";
	private final String exclusaoRota = "/oficina/{id}/excluir";
	private final String rotaBase = "/oficina";
	private final String inclusaoRota = "/oficina/incluir";
	private final String cadastroRota = "oficina/cadastro";

	@Autowired
	private OficinaService oficinaService;
	@Autowired
	private CepService cepService;
	@Autowired
	private GerenteService gerenteService;

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

	@GetMapping(value = rotaBase)
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("gerentes", gerenteService.obterLista(usuario));

		return cadastroRota;
	}

	@PostMapping(value = inclusaoRota)
	public String incluir(Oficina oficina) {

		oficinaService.incluir(oficina);

		return "redirect:" + listaRota;
	}

	@PostMapping(value = "/oficina/cep")
	public String obterCep(Model model, @RequestParam String cep,  @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("endereco", cepService.obterCep(cep));
		model.addAttribute("gerentes", gerenteService.obterLista(usuario));

		return cadastroRota;
	}
}
