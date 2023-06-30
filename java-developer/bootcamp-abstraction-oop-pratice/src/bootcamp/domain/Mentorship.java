package bootcamp.domain;

import java.time.LocalDate;

public class Mentorship {
  private String title;
  private String description;
  private LocalDate date;

  public Mentorship(String title, String description) {
    this.title = title;
    this.description = description;
    this.date = LocalDate.now();
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

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
}
