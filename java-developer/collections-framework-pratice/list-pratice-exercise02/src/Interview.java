import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Interview {
  private List<String> questions = Arrays.asList("Telefonou para a vítima?", "Esteve no local do crime?",
      "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?");
  private List<Boolean> answers = new ArrayList<>();

  public Interview() {
    Scanner interviewer = new Scanner(System.in);
    System.out.println("Entrevista começando...\n");

    for (String question : questions) {
      System.out.println(String.format("%s\nDigite Y para sim e N para não", question));
      String answer = interviewer.nextLine();
      answers.add(answer.equalsIgnoreCase("Y") ? true : false);
    }

    interviewer.close();
  }

  public List<Boolean> getRelatory() {
    return this.answers;
  }
}
