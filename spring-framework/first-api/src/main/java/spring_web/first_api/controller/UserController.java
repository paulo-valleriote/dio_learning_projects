package spring_web.first_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_web.first_api.model.User;
import spring_web.first_api.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserRepository repository;

  @GetMapping
  public List<User> getUsers() {
    return repository.findAll();
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") Integer id) {
    repository.deleteById(id);
  }
}
