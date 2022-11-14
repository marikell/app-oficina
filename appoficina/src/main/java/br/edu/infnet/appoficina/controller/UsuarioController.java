package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appoficina.model.domain.Usuario;
import br.edu.infnet.appoficina.service.CepService;
import br.edu.infnet.appoficina.service.UsuarioService;

@Controller
public class UsuarioController {
	private final String listaRota = "/usuario/lista";
	private final String exclusaoRota = "/usuario/{id}/excluir";
	private final String rotaBase = "/usuario";
	private final String inclusaoRota = "/usuario/incluir";
	private final String cadastroRota = "usuario/cadastro";
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CepService cepService;

	@GetMapping(value = listaRota)
	public String telaLista(Model model) {
		model.addAttribute("listagem", usuarioService.obterLista());

		return listaRota;
	}

	@GetMapping(value = rotaBase)
	public String telaCadastro() {
		return cadastroRota;
	}

	@PostMapping(value = inclusaoRota)
	public String incluir(Usuario usuario) {

		usuarioService.incluir(usuario);

		return "redirect:" + listaRota;
	}

	@GetMapping(value = exclusaoRota)
	public String excluir(@PathVariable Integer id) {

		usuarioService.excluir(id);

		return "redirect:" + listaRota;
	}
	
	@PostMapping(value = "/usuario/cep")
	public String obterCep(Model model, @RequestParam String cep){

		model.addAttribute("endereco", cepService.obterCep(cep));

		return cadastroRota;
	}
}
