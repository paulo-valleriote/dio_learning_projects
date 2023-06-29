package bank.account.model;

import bank.Admin;

public class Account extends BankOperations {
  private String name;
  private String password;
  private int token;

  public Account(String[] args) {
    setName(args[0]);
    setPassword(args[1]);
    this.token = this.name.hashCode();
    System.out.println("Seu token é " + token);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  protected boolean passwordsAreEqual(String password) {
    return this.password.equals(password);
  }

  public String changePassword(String newPassword, int token) throws Exception {
    if (token != this.token)
      throw new Exception("Token inválido");
    setPassword(newPassword);
    return this.password;
  }

  public int getToken(String master_secret) throws Exception {
    if (master_secret == new Admin().getMasterSecret()) {
      return this.token;
    }

    throw new Exception("Você não tem permissão para acessar este recurso");
  }
}
