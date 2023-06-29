package bank.account;

import bank.account.model.Account;

public class PersonalAccount extends Account {
  private String cpf;

  public PersonalAccount(String[] args, String cpf) {
    super(args);
    this.cpf = cpf;
  }

  public String getCpf(String password) throws Exception {
    if (this.passwordsAreEqual(password)) {
      throw new Exception("Acesso negado");
    }
    return this.cpf;
  }
}
