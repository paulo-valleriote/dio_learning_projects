import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Double> values = Arrays.asList(14.0, 32.5, 22.0, 36.0, 40.4, 26.0, 20.5);

        Metereology metereology = new Metereology(values);
        Double semesterAverage = metereology.getSemesterAverage();
        List<Double> temperatureList = metereology.getTemperatureList();
        metereology.getAnomalies(metereology.getMonths(temperatureList.size()), semesterAverage);
    }
}
