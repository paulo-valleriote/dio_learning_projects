import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Interview interview = new Interview();

        List<Boolean> relatory = interview.getRelatory();
        Detective detective = new Detective("Pereira");
        detective.caseAnalysis(relatory);
    }
}
