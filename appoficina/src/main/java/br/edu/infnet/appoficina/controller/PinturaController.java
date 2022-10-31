package br.edu.infnet.appoficina.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appoficina.model.domain.Pintura;

@Controller
public class PinturaController {

	private final String listaRota = "/pintura/lista";
	private final String exclusaoRota = "/pintura/{id}/excluir";
	private static Integer id = 1;

	private static Map<Integer, Pintura> mapa = new HashMap<Integer, Pintura>();

	public static void incluir(Pintura entity) {
		entity.setId(id);
		mapa.put(id++, entity);
		System.out.println("Pintura - " + entity);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public List<Pintura> obterLista() {
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
