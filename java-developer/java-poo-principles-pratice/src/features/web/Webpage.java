package features.web;

public class Webpage {
  public String displayName;
  public String url;

  Webpage(String[] args) {
    this.displayName = args[0];
    this.url = args[1];
  }
}
