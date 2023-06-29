import java.util.List;

public class Detective {
  private String name;

  public Detective(String name) {
    this.name = name;
  }

  public void caseAnalysis(List<Boolean> previousInvestigation) {
    int pointsOfSuspecion = 0;

    for (Boolean clue : previousInvestigation) {
      if (clue)
        pointsOfSuspecion += 1;
    }
    System.out.println(pointsOfSuspecion);
    String judgmentState;
    if (pointsOfSuspecion > 4) {
      judgmentState = "Assassino(a)";
    } else if (pointsOfSuspecion > 2) {
      judgmentState = "Cúmplice";
    } else if (pointsOfSuspecion == 2) {
      judgmentState = "Suspeito(a)";
    } else {
      judgmentState = "Inocente";
    }

    System.out.println(String.format("\nOlá, meu nome é %s. Sou o responsável pelo caso.", this.name));
    System.out.println(String.format("Após rigorosa análise, você foi considerado(a) %s", judgmentState));
  }
}
