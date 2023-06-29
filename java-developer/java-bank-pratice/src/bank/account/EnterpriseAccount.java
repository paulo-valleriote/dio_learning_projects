package bank.account;

import bank.account.model.Account;

public class EnterpriseAccount extends Account {
  private String cnpj;

  public EnterpriseAccount(String[] args, String cnpj) {
    super(args);
    this.cnpj = cnpj;
  }

  public String getCnpj(String password) throws Exception {
    if (this.passwordsAreEqual(password)) {
      throw new Exception("Acesso negado");
    }
    return this.cnpj;
  }
}
