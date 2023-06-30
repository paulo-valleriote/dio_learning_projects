package software_development;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Developer {
  Set<ProgrammingLanguage> favoriteLanguages = new TreeSet<ProgrammingLanguage>();

  public Developer(List<ProgrammingLanguage> languages) {
    for (ProgrammingLanguage language : languages) {
      this.favoriteLanguages.add(language);
    }

    System.out.println("Minhas linguagens favoritas são:" + languages);
  }

  public void listFavoriteLanguages() {
    System.out.println(favoriteLanguages.stream().toList());
  }

  public void listFavoriteLanguagesByCreationYear() {
    List<ProgrammingLanguage> ordered;

    ordered = this.favoriteLanguages.stream()
        .sorted((l1, l2) -> Integer.compare(l1.getYearOfCreation(), l2.getYearOfCreation())).toList();
    System.out.println(ordered);
  }

  public void listFavoriteLanguagesByNameAndCreationYear() {
    List<ProgrammingLanguage> ordered;

    ordered = this.favoriteLanguages.stream()
        .sorted((l1, l2) -> {
          if (l1.getName() == l2.getName())
            return 0;

          if (l1.getYearOfCreation() == l2.getYearOfCreation())
            return 0;

          return -1;
        }).toList();
    System.out.println(ordered);
  }
}
