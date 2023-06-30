package weather;

public class Color implements Comparable<Color> {
  private String name;

  public Color(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public int compareTo(Color other) {
    return this.name.compareTo(other.name);
  }

}
