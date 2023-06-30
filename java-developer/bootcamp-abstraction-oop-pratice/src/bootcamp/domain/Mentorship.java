package bootcamp.domain;

import java.time.LocalDate;

public class Mentorship extends Content {
  private LocalDate date;

  public Mentorship(String title, String description) {
    super(title, description);
    this.date = LocalDate.now();
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public double getXp() {
    return DEFAULT_XP + 200;
  }

  @Override
  public String toString() {
    return "Mentorship{" +
        "title=" + getTitle() + '\'' +
        ", description=" + getDescription() + '\'' +
        ", date=" + date +
        '}';
  }

}
