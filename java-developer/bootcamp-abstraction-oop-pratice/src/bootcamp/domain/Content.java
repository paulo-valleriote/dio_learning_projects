package bootcamp.domain;

public abstract class Content {
  protected static final double DEFAULT_XP = 10.0;
  private String title;
  private String description;

  protected Content(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public abstract double getXp();
}
