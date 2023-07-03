package spring_scope_types.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

  @Bean
  @Scope("prototype")
  public Receiver receiver() {
    System.out.println("Criando um remetente...");
    Receiver receiver = new Receiver();
    receiver.setEmail("noreply@dio.com.br");
    receiver.setName("Digital Innovation One");
    return receiver;
  }
}
