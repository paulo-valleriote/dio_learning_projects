import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import bootcamp.domain.Bootcamp;
import bootcamp.domain.Content;
import bootcamp.domain.Course;
import bootcamp.domain.Developer;
import bootcamp.domain.Mentorship;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Registrando conteúdos da plataforma...");
        Course javaSintax = new Course("Sintaxe do Java", "Aprenda o básico para programar em Java.", 2);
        Course javaOop = new Course("POO em Java", "Aprenda programação orientada a objetos em Java", 4);
        Course spring = new Course("Aprenda Spring", "Hora de dar um passo além! Vamos aprender Spring Boot!", 6);
        Mentorship javaBootcampMentorship = new Mentorship("Mentoria Java", "Hora de tirar suas dúvidas!");
        Set<Content> bootcampContent = new LinkedHashSet<>(
                Arrays.asList(javaSintax, javaOop, spring, javaBootcampMentorship));

        System.out.println("Registrando bootcamp na plataforma...\n");
        Bootcamp bootcamp = new Bootcamp("Formação Java", "Estude a linguagem Java to zero ao avançado!");
        bootcamp.setContents(bootcampContent);

        System.out.println("John Doe acessou nossa plataforma");
        Developer johnDoe = new Developer("John Doe");
        System.out.println("John Doe se inscreveu no bootcamp " + bootcamp.getName() + "\n");
        johnDoe.subscribeBootcamp(bootcamp);

        for (Content content : bootcampContent) {
            System.out.println("Concluindo: " + content.getTitle());
            johnDoe.makeBootcampProgress(bootcamp);
            System.out.println("XP acumulado: " + content.getXp() + "\n");
        }
        System.out.println("\nJohn doe se saiu muito bem durante o bootcamp escolhido e concluiu sua formação!");
    }
}
