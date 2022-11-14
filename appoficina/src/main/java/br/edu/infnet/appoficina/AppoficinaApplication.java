package br.edu.infnet.appoficina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppoficinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppoficinaApplication.class, args);
	}

}
