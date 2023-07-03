package string_properties_value.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageSystem implements CommandLineRunner {
  @Autowired
  private Sender sender;

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Mensagem enviada por: " + sender.getName() +
        "\nE-mail: " + sender.getEmail() +
        "\nCom telefones para contanto: " + sender.getPhones());
    System.out.println("Seu cadastro foi aprovado");
  }

}
