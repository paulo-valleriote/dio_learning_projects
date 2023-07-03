package dio.firststeps;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.firststeps.app.JsonConverter;
import dio.firststeps.app.ViaCepResponse;

@SpringBootApplication
public class FirstStepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstStepsApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(JsonConverter converter) throws Exception {
		return args -> {
			String json = "{\"cep\":\"01001-00\",\"address\":\"Praça da Sé\",\"location\":\"São Paulo\"}";
			ViaCepResponse response = converter.convert(json);
			System.out.println("Dados do CEP: " + response);
		};
	}

}
