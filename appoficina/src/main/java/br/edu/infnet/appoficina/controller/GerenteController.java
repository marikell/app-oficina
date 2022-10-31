package br.edu.infnet.appoficina.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appoficina.model.domain.Gerente;

@Controller
public class GerenteController {
	private final String listaRota = "/gerente/lista";
	private final String exclusaoRota = "/gerente/{id}/excluir";
	private static Integer id = 1;

	private static Map<Integer, Gerente> mapa = new HashMap<Integer, Gerente>();

	public static void incluir(Gerente entity) {
		entity.setId(id);
		mapa.put(id++, entity);
		System.out.println("Gerente - " + entity);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public List<Gerente> obterLista() {
		return new ArrayList<>(mapa.values());
	}

	@GetMapping(value = listaRota)
	public String telaLista(Model model) {

		model.addAttribute("listagem", this.obterLista());
		
		return listaRota;
	}

	@GetMapping(value = exclusaoRota)
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:" + listaRota;
	}
}
