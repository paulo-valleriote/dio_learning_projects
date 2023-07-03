package string_properties_value.app;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sender")
public class Sender {
  private String name;
  private String email;
  private List<Long> phones;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Long> getPhones() {
    return phones;
  }

  public void setPhones(List<Long> phones) {
    this.phones = phones;
  }
}
