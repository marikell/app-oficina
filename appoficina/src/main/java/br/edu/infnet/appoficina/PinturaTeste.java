package br.edu.infnet.appoficina;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Gerente;
import br.edu.infnet.appoficina.model.domain.Oficina;
import br.edu.infnet.appoficina.model.domain.Pintura;
import br.edu.infnet.appoficina.model.domain.TipoMassaAplicada;
import br.edu.infnet.appoficina.model.domain.TipoPintura;
import br.edu.infnet.appoficina.service.GerenteService;
import br.edu.infnet.appoficina.service.OficinaService;
import br.edu.infnet.appoficina.service.PinturaService;

@Order(7)
@Component
public class PinturaTeste implements ApplicationRunner {

	@Autowired
	private PinturaService pinturaService;
	
	@Autowired
	private GerenteService gerenteService;
	
	@Autowired
	private OficinaService oficinaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Lauren Silva");
		gerente1.setCpf("24232323");
		gerente1.setEmail("lauren.silva@oficina.com.br");
		gerente1.setDataContratacao(Calendar.getInstance());
		
		gerenteService.incluir(gerente1);
		
		Oficina oficina1 = new Oficina(gerente1);
		oficina1.setNome("Oficina Alto da Montanha");
		oficina1.setCidade("São Roque");
		oficina1.setEndereco("Rua São Roque");
		oficina1.setBairro("Bairro de SR");
		oficina1.setEstado("SP");	
		
		oficinaService.incluir(oficina1);
		
		Pintura pintura1 = new Pintura();
		pintura1.setCorTexto("#FFFFFF");
		pintura1.setValor(20);
		pintura1.setTipoMassaAplicada(TipoMassaAplicada.Acrilica);
		pintura1.setTipoPintura(TipoPintura.Metalica);
		pintura1.setOficina(oficina1);
		
		Pintura pintura2 = new Pintura();		
		pintura2.setValor(10);
		pintura2.setTipoMassaAplicada(TipoMassaAplicada.Poliester);
		pintura2.setTipoPintura(TipoPintura.Solida);
		pintura2.setCorTexto("#FFFFFF");
		pintura2.setOficina(oficina1);
		
		Pintura pintura3 = new Pintura();		
		pintura3.setValor(44);
		pintura3.setTipoMassaAplicada(TipoMassaAplicada.Plastica);
		pintura3.setTipoPintura(TipoPintura.Perolizada);		
		pintura3.setCorTexto("#FFFFFF");
		pintura3.setOficina(oficina1);
		
		pinturaService.incluir(pintura1);
		pinturaService.incluir(pintura2);
		pinturaService.incluir(pintura3);
	}
}
