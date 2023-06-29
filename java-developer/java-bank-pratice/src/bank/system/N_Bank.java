package bank.system;

import bank.system.model.Bank;

public class N_Bank extends Bank {
  private String name;

  public N_Bank(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
