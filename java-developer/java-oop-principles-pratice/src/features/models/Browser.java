package features.models;

import java.util.List;
import features.web.Webpage;

public abstract class Browser {
  public String currentUrl;
  protected Webpage currentPage;
  protected List<Webpage> openPageTabs;

  public abstract void showPage();

  public abstract void updatePage();

  public abstract void newPageTab(String[] args);

  public abstract void showPagesList();
}
