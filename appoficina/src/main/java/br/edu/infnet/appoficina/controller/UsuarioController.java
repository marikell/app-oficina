package br.edu.infnet.appoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appoficina.model.domain.Usuario;
import br.edu.infnet.appoficina.service.UsuarioService;

@Controller
public class UsuarioController {
	private final String listaRota = "/usuario/lista";
	private final String exclusaoRota = "/usuario/{id}/excluir";
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(value = listaRota)
	public String telaLista(Model model) {
		model.addAttribute("listagem", usuarioService.obterLista());

		return listaRota;
	}

	@GetMapping(value = "/usuario")
	public String telaCadastro() {
		return "usuario/cadastro";
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {

		usuarioService.incluir(usuario);

		return "redirect:" + listaRota;
	}

	@GetMapping(value = exclusaoRota)
	public String excluir(@PathVariable Integer id) {

		usuarioService.excluir(id);

		return "redirect:" + listaRota;
	}
}
