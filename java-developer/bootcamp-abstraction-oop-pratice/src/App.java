import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import bootcamp.domain.Bootcamp;
import bootcamp.domain.Content;
import bootcamp.domain.Course;
import bootcamp.domain.Developer;
import bootcamp.domain.Mentorship;

public class App {
    public static void main(String[] args) throws Exception {
        Course javaSintax = new Course("Sintaxe do Java", "Aprenda o básico para programar em Java.", 2);
        Course javaOop = new Course("POO em Java", "Aprenda programação orientada a objetos em Java", 4);
        Course spring = new Course("Aprenda Spring", "Hora de dar um passo além! Vamos aprender Spring Boot!", 6);
        Mentorship javaBootcampMentorship = new Mentorship("Mentoria Java", "Hora de tirar suas dúvidas!");
        Set<Content> bootcampContent = new TreeSet<>(
                Arrays.asList(javaSintax, javaOop, spring, javaBootcampMentorship));

        Bootcamp bootcamp = new Bootcamp("Formação Java", "Estude a linguagem Java to zero ao avançado!");
        bootcamp.setContents(bootcampContent);

        Developer johnDoe = new Developer("John Doe");
        johnDoe.subscribeBootcamp(bootcamp);
    }
}
