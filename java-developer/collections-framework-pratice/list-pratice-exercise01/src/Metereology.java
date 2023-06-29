
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Metereology {
  private List<Double> temperatureList;
  private String[] monthsOfYear = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
      "Novembro", "Dezembro" };

  public Metereology(List<Double> temperatures) {
    this.temperatureList = new ArrayList<>(temperatures);
  }

  public String[] getMonths(int numberOfMonths) {
    String[] selectedMonths = new String[numberOfMonths];
    for (int i = 0; i < numberOfMonths - 1; i++)
      selectedMonths[i] = monthsOfYear[i];

    return selectedMonths;
  }

  public List<Double> getTemperatureList() {
    return this.temperatureList;
  }

  public double getSemesterAverage() {
    Iterator<Double> iterator = this.temperatureList.iterator();

    Double sum = 0.0;
    while (iterator.hasNext()) {
      Double currentTemperature = iterator.next();
      sum += currentTemperature;
    }

    return sum / this.temperatureList.size();
  }

  public void getAnomalies(String[] monthsToAnalyse, Double semesterTemperatureAverage) {
    List<String> months = Arrays.asList(monthsToAnalyse);

    String climateResume = "";
    for (int i = 0; i < temperatureList.size(); i++) {
      Double currentTemperature = temperatureList.get(i);
      String currentMonth = months.get(i);

      if (currentTemperature < semesterTemperatureAverage)
        continue;
      if (climateResume.length() < 1) {
        climateResume += String.format("%d - %s", i, currentMonth);
        continue;
      }
      climateResume += String.format(", %d - %s", i, currentMonth);
    }

    System.out.println(String.format("A média de temperatura semestral foi %.2f c°", semesterTemperatureAverage));
    System.out.println("Sendo que leituras acima da média foram identificadas nos seguintes meses:");
    System.out.println(climateResume);
  }
}
