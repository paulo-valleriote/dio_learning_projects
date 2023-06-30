package bootcamp.domain;

public class Course {
  private String title;
  private String description;
  private int duration;

  public Course(String title, String description, int duration) {
    this.title = title;
    this.description = description;
    this.duration = duration;
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

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }
}
