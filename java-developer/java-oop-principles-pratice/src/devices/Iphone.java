package devices;

import devices.models.Phone;
import features.clock.Clock;

public class Iphone extends Phone {
  public Iphone(String[] args) {
    this.owner = args[0];
    this.phoneNumber = args[1];
  }

  @Override
  public void call(String phoneToCall) {
    System.out.println("Ligando para " + phoneToCall + "...");
  }

  @Override
  public void acceptCall(boolean accept) {
    System.out.println("Tocando...");
    if (accept)
      System.out.println("Ligação aceita");
    else
      System.out.println("Ligação recusada");
  }

  @Override
  public void playVoiceMessage() {
    System.out.println("Caixa de mensagem: 1 mensagem");
    System.out.println("Oi, " + this.owner + " estou precisando falar com você, quando puder me liga!");
  }

  @Override
  public void showCurrentTime() {
    System.out.println(new Clock().currentTime);
  }
}
