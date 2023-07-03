package spring_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import spring_data.model.User;
import spring_data.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
  @Autowired
  private UserRepository repository;

  @Override
  public void run(String... args) throws Exception {
    User user = new User();
    user.setName("Paulo");
    user.setEmail("paulomv29@outlook.com");
    user.setPassword("qualquerSenha");

    repository.save(user);

    for (User u : repository.findAll()) {
      System.out.println(u.toString());
    }
  }

}
