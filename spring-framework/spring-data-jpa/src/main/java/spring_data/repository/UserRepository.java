package spring_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_data.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
