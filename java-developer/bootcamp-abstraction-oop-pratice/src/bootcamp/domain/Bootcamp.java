package bootcamp.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
  private String name;
  private String description;
  private LocalDate start_date = LocalDate.now();
  private final LocalDate end_date = start_date.plusDays(45);
  private Set<Developer> subscribedDevelopers = new HashSet<>();
  private Set<Content> contents = new LinkedHashSet<>();

  public Bootcamp(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getStart_date() {
    return start_date;
  }

  public void setStart_date(LocalDate start_date) {
    this.start_date = start_date;
  }

  public LocalDate getEnd_date() {
    return end_date;
  }

  public Set<Developer> getSubscribedDevelopers() {
    return subscribedDevelopers;
  }

  public void setSubscribedDevelopers(Set<Developer> subscribedDevelopers) {
    this.subscribedDevelopers = subscribedDevelopers;
  }

  public Set<Content> getContents() {
    return contents;
  }

  public void setContents(Set<Content> contents) {
    this.contents = contents;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
    result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
    result = prime * result + ((subscribedDevelopers == null) ? 0 : subscribedDevelopers.hashCode());
    result = prime * result + ((contents == null) ? 0 : contents.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Bootcamp other = (Bootcamp) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (start_date == null) {
      if (other.start_date != null)
        return false;
    } else if (!start_date.equals(other.start_date))
      return false;
    if (end_date == null) {
      if (other.end_date != null)
        return false;
    } else if (!end_date.equals(other.end_date))
      return false;
    if (subscribedDevelopers == null) {
      if (other.subscribedDevelopers != null)
        return false;
    } else if (!subscribedDevelopers.equals(other.subscribedDevelopers))
      return false;
    if (contents == null) {
      if (other.contents != null)
        return false;
    } else if (!contents.equals(other.contents))
      return false;
    return true;
  }
}
