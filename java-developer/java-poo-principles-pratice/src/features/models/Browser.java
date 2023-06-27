package features.models;

import features.web.Webpage;

public abstract class Browser {
  public String currentUrl;
  protected Webpage[] openPageTabs;

  public abstract void showPage();

  public abstract void updatePage();

  public abstract void newPageTab(String[] args);
}
