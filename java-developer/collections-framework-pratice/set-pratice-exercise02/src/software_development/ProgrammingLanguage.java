package software_development;

import java.util.Comparator;

public class ProgrammingLanguage implements Comparator<ProgrammingLanguage> {
  private String name;
  private int yearOfCreation;

  public ProgrammingLanguage(String name, int yearOfCreation) {
    this.name = name;
    this.yearOfCreation = yearOfCreation;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setYearOfCreation(int year) {
    this.yearOfCreation = year;
  }

  public String getName() {
    return this.name;
  }

  public int getYearOfCreation() {
    return this.yearOfCreation;
  }

  @Override
  public int compare(ProgrammingLanguage languageOne, ProgrammingLanguage languageTwo) {
    return compare(languageOne, languageTwo);
  }
}
