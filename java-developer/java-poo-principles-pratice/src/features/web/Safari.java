package features.web;

import features.models.Browser;

public class Safari extends Browser {
  public Safari(String[] args) {
    openPageTabs = new Webpage[4];
    Webpage newPage = new Webpage(args);
    currentUrl = newPage.url;
    openPageTabs[0] = newPage;
  }

  public void showPage() {
    System.out.println("Página atual: " + openPageTabs[0].displayName);
  }

  @Override
  public void updatePage() {
    System.out.println("Atualizando a página...");
    System.out.println("Página atualizada!");
  }

  @Override
  public void newPageTab(String[] args) {
    openPageTabs[0] = new Webpage(args);
  }

}
