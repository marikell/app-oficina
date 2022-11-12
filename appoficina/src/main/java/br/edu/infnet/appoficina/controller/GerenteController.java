package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appoficina.model.domain.Gerente;
import br.edu.infnet.appoficina.model.domain.Usuario;
import br.edu.infnet.appoficina.service.GerenteService;

@Controller
@ComponentScan
public class GerenteController  {	
	private final String rotaBase = "/gerente";
	private final String inclusaoRota = "/gerente/incluir";
	private final String cadastroRota = "gerente/cadastro";
	private final String listaRota = "/gerente/lista";
	private final String exclusaoRota = "/gerente/{id}/excluir";
	
	@Autowired
	private GerenteService gerenteService;

	@GetMapping(value = listaRota)
	public String telaLista(Model model) {
		model.addAttribute("listagem", gerenteService.obterLista());

		return listaRota;
	}
	
	@GetMapping(value = rotaBase)
	public String telaCadastro() {
		return cadastroRota;
	}
	
	@GetMapping(value = exclusaoRota)
	public String exclusao(@PathVariable Integer id) {

		gerenteService.excluir(id);
		
		return "redirect:" + listaRota;
	}

	@PostMapping(value = inclusaoRota)
	public String incluir(Gerente gerente, @SessionAttribute("user") Usuario usuario) {

		gerente.setUsuario(usuario);

		gerenteService.incluir(gerente);

		return "redirect:" + listaRota;
	}
}

