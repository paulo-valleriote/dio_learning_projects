package weather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Rainbow {
  private Set<Color> colors;

  public Rainbow() {
    this.colors = new TreeSet<>(this.makeColorsList());
  }

  public void makeRainbow() {
    for (Color color : colors) {
      System.out.println(color.getName());
    }
  }

  public void numberOfColors() {
    System.out.println(this.colors.size());
  }

  public void alphabeticOrder() {
    Stream<String> aplhabeticOrdered = this.colors.stream().map((Color currColor) -> currColor.getName());
    System.out.println(aplhabeticOrdered.toList());
  }

  public void reverseAlphabeticOrder() {
    Stream<String> aplhabeticOrdered = this.colors.stream().map((Color currColor) -> currColor.getName());
    System.out.println(aplhabeticOrdered.sorted(Comparator.reverseOrder()).toList());
  }

  public void startingWithLetter(String letter) {
    Iterator<Color> colorIterator = this.colors.iterator();
    List<String> colorStartingWithLetter = new ArrayList<>();

    while (colorIterator.hasNext()) {
      Color currColor = colorIterator.next();
      if (currColor.getName().toLowerCase(Locale.ENGLISH).startsWith(letter)) {
        colorStartingWithLetter.add(currColor.getName());
      }
    }

    System.out.println(colorStartingWithLetter);
  }

  public void removeIfNotStartWithLetter(String letter) {
    Iterator<Color> colorIterator = this.colors.iterator();
    Set<Color> colorWithoutLetter = new TreeSet<>();
    List<String> colorNamesWithoutLetter = new ArrayList<>();

    while (colorIterator.hasNext()) {
      Color currColor = colorIterator.next();

      if (!currColor.getName().toLowerCase(Locale.ENGLISH).startsWith(letter)) {
        colorWithoutLetter.add(currColor);
        colorNamesWithoutLetter.add(currColor.getName());
      }
    }
    this.colors = colorWithoutLetter;
    System.out.println(colorNamesWithoutLetter);
  }

  public void clearRainbow() {
    this.colors.clear();
  }

  public boolean isEmpty() {
    return this.colors.size() < 1 ? true : false;
  }

  private List<Color> makeColorsList() {
    List<Color> colors = new ArrayList<>();
    List<String> colorOptions = Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Índigo", "Violeta");

    for (int i = 0; i < 7; i++) {
      colors.add(new Color(colorOptions.get(i)));
    }

    return colors;
  }

}
