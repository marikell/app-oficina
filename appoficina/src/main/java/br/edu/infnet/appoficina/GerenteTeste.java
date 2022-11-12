package br.edu.infnet.appoficina;

import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Gerente;
import br.edu.infnet.appoficina.model.domain.Usuario;
import br.edu.infnet.appoficina.service.GerenteService;
import br.edu.infnet.appoficina.service.UsuarioService;

@Order(3)
@Component
public class GerenteTeste implements ApplicationRunner {

	@Autowired
	private GerenteService gerenteService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {			
		Usuario usuario = new Usuario();
		usuario.setEmail("usuario1@gmail.com");
		usuario.setNome("Usuário 1");
		usuario.setSenha("123");
		
		usuarioService.incluir(usuario);
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("João Silva");
		gerente1.setCpf("46825186925");
		gerente1.setEmail("joao.silva@oficina.com.br");
		gerente1.setDataContratacao(getCalendar(2020, Month.APRIL, 12));
		gerente1.setUsuario(usuario);

		Gerente gerente2 = new Gerente();
		gerente2.setNome("Maria Flor Souza");
		gerente2.setCpf("47825286125");
		gerente2.setEmail("mariaflor.souza@oficina.com.br");
		gerente2.setDataContratacao(getCalendar(2022, Month.APRIL, 10));
		gerente2.setUsuario(usuario);
		
		Gerente gerente3 = new Gerente();
		gerente3.setNome("Lua Castro");
		gerente3.setCpf("46821232311");
		gerente3.setEmail("lua.castro@oficina.com.br");
		gerente3.setDataContratacao(getCalendar(2019, Month.AUGUST, 1));
		gerente3.setUsuario(usuario);
		
		gerenteService.incluir(gerente1);
		gerenteService.incluir(gerente2);
		gerenteService.incluir(gerente3);
	}

	private Calendar getCalendar(int ano, Month month, int dia) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, ano);
		gc.set(Calendar.MONTH, month.getValue() - 1);
		gc.set(Calendar.DAY_OF_MONTH, dia);

		return gc;
	}
}
