package spring_scope_types;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import spring_scope_types.app.Messager;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScopeTypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScopeTypeApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(Messager messager) throws Exception {
		return args -> {
			messager.sendSignUpConfirmation();
			messager.sendWelcomeMessage();
			messager.sendSignUpConfirmation();
		};
	}
}
