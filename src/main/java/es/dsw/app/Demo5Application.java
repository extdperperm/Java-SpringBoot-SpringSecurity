package es.dsw.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="es.dsw")
public class Demo5Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo5Application.class, args);
	}

}
