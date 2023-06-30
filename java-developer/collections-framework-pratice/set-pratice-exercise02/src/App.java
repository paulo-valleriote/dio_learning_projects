import java.util.Arrays;
import java.util.List;
import software_development.Developer;
import software_development.ProgrammingLanguage;

public class App {
    public static void main(String[] args) throws Exception {
        ProgrammingLanguage java = new ProgrammingLanguage("Java", 1996);
        ProgrammingLanguage python = new ProgrammingLanguage("Python", 1991);
        ProgrammingLanguage javascript = new ProgrammingLanguage("Javascript", 1995);

        List<ProgrammingLanguage> languages = Arrays.asList(java, python, javascript);

        Developer myself = new Developer(languages);

        myself.listFavoriteLanguages();
        System.out.println("");
        myself.listFavoriteLanguagesByCreationYear();
        System.out.println("");
        myself.listFavoriteLanguagesByNameAndCreationYear();
    }
}
