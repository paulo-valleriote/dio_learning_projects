package bootcamp.domain;

public class Course extends Content {
  private int durationInHours;

  public Course(String title, String description, int durationInHours) {
    super(title, description);
    this.durationInHours = durationInHours;
  }

  public int getDurationInHours() {
    return durationInHours;
  }

  public void setDurationInHours(int durationInHours) {
    this.durationInHours = durationInHours;
  }

  @Override
  public double getXp() {
    return DEFAULT_XP * durationInHours;
  }

  @Override
  public String toString() {
    return "Course{" +
        "title=" + getTitle() + '\'' +
        ", description=" + getDescription() + '\'' +
        ", durationInHours=" + durationInHours +
        '}';
  }
}
