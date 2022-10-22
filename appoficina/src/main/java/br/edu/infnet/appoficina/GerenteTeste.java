package br.edu.infnet.appoficina;

import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Gerente;

@Component
public class GerenteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Gerente g1 = new Gerente();
		g1.nome = "Antônio Silva";
		g1.cpf = "46825186925";
		g1.email = "antonio.silva@oficina.com.br";
		g1.dataContratacao = getCalendar(2020, Month.APRIL, 12);

		Gerente g2 = new Gerente();
		g2.nome = "Maria Flor Souza";
		g2.cpf = "47825286125";
		g2.email = "mariaflor.souza@oficina.com.br";
		g2.dataContratacao = getCalendar(2022, Month.APRIL, 10);

		Gerente g3 = new Gerente();
		g3.nome = "Lua Castro";
		g3.cpf = "46821232311";
		g3.email = "lua.castro@oficina.com.br";
		g3.dataContratacao = getCalendar(2019, Month.AUGUST, 1);

		exibir(g1);
		exibir(g2);
		exibir(g3);
	}

	private Calendar getCalendar(int ano, Month month, int dia) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, ano);
		gc.set(Calendar.MONTH, month.getValue() - 1);
		gc.set(Calendar.DAY_OF_MONTH, dia);

		return gc;
	}
	
	private void exibir(Gerente gerente) {
		System.out.println("Gerente - " + gerente);
	}
}
