package spring_web.first_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import spring_web.first_api.model.User;

@Repository
public class UserRepository {
  public void save(User user) {
    if (user.getId() == null)
      System.out.println("SAVE - Recebendo o usuário na camada de repositório");
    else
      System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

    System.out.println(user);
  }

  public void deleteById(Integer id) {
    System.out
        .println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário na camada de repositório", id));
  }

  public List<User> findAll() {
    System.out.println("LIST - Mostrando os usuários do sistema");
    List<User> users = new ArrayList<>();
    users.add(new User("any_name", "any_password"));
    users.add(new User("other_name", "other_password"));
    return users;
  }

  public User findById(Integer id) {
    System.out
        .println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário na camada de repositório", id));
    return new User("any_name", "any_password");
  }
}
