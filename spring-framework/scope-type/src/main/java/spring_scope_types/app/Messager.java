package spring_scope_types.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Messager {
  @Autowired
  private Receiver noreply;
  @Autowired
  private Receiver techTeam;

  public void sendSignUpConfirmation() {
    System.out.println(noreply);
    System.out.println("Seu cadastro foi aprovado com sucesso!");
  }

  public void sendWelcomeMessage() {
    techTeam.setEmail("tech@dio.com.br");
    System.out.println(techTeam);
    System.out.println("Bem vindo à Tech Elite");
  }
}
