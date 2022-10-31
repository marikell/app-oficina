package br.edu.infnet.appoficina;

import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.controller.GerenteController;
import br.edu.infnet.appoficina.model.domain.Gerente;

@Component
public class GerenteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Antônio Silva");
		gerente1.setCpf("46825186925");
		gerente1.setEmail("antonio.silva@oficina.com.br");
		gerente1.setDataContratacao(getCalendar(2020, Month.APRIL, 12));

		Gerente gerente2 = new Gerente();
		gerente2.setNome("Maria Flor Souza");
		gerente2.setCpf("47825286125");
		gerente2.setEmail("mariaflor.souza@oficina.com.br");
		gerente2.setDataContratacao(getCalendar(2022, Month.APRIL, 10));

		Gerente gerente3 = new Gerente();
		gerente3.setNome("Lua Castro");
		gerente3.setCpf("46821232311");
		gerente3.setEmail("lua.castro@oficina.com.br");
		gerente3.setDataContratacao(getCalendar(2019, Month.AUGUST, 1));
		
		GerenteController.incluir(gerente1);
		GerenteController.incluir(gerente2);
		GerenteController.incluir(gerente3);
	}

	private Calendar getCalendar(int ano, Month month, int dia) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, ano);
		gc.set(Calendar.MONTH, month.getValue() - 1);
		gc.set(Calendar.DAY_OF_MONTH, dia);

		return gc;
	}
}
