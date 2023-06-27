package features.music;

public class Music {
  public String name;
  public int durationInSeconds;

  Music(String name, int durationInMinutes) {
    this.name = name;
    this.durationInSeconds = durationInMinutes * 60;
  }
}
