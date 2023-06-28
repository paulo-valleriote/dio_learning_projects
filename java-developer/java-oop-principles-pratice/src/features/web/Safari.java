package features.web;

import java.util.ArrayList;

import features.models.Browser;

public class Safari extends Browser {
  public Safari(String[] args) {
    openPageTabs = new ArrayList<Webpage>();
    Webpage newPage = new Webpage(args);

    currentUrl = newPage.url;
    openPageTabs.add(newPage);
  }

  public void showPage() {
    System.out.println("Página atual: " + openPageTabs.get(0).displayName);
  }

  @Override
  public void updatePage() {
    System.out.println("Atualizando a página...");
    System.out.println("Página atualizada!");
  }

  @Override
  public void newPageTab(String[] args) {
    openPageTabs.add(new Webpage(args));
  }

  @Override
  public void showPagesList() {
    String openTabsMessage = "Guias abertas: ";
    for (Webpage tab : openPageTabs) {
      openTabsMessage += tab.displayName + " / ";
    }

    System.out.println(openTabsMessage);
  }

}
