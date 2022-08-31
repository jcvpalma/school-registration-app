package br.com.jcvpalma.registrationapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.jcvpalma")
public class RegistrationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationApiApplication.class, args);
	}

}
