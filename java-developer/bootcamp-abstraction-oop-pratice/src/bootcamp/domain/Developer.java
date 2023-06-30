package bootcamp.domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Developer {
  private String name;
  private Set<Content> contentSubscriptions = new LinkedHashSet<>();
  private Set<Content> contentConcluded = new LinkedHashSet<>();

  public Developer(String name) {
    this.name = name;
  }

  public void subscribeBootcamp(Bootcamp bootcamp) {
    this.contentSubscriptions.addAll(bootcamp.getContents());
    bootcamp.getSubscribedDevelopers().add(this);
  }

  public void makeBootcampProgress(Bootcamp bootcamp) {
    Optional<Content> content = this.contentSubscriptions.stream().findFirst();
    if (content.isPresent()) {
      this.contentConcluded.add(content.get());
      this.contentSubscriptions.remove(content.get());
    } else {
      System.err.println("Você não está matriculado em nenhum conteúdo");
    }
  }

  public double getXp() {
    return this.contentConcluded.stream().mapToDouble(Content::getXp).sum();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Content> getContentSubscriptions() {
    return contentSubscriptions;
  }

  public void setContentSubscriptions(Set<Content> contentSubscriptions) {
    this.contentSubscriptions = contentSubscriptions;
  }

  public Set<Content> getContentConcluded() {
    return contentConcluded;
  }

  public void setContentConcluded(Set<Content> contentConcluded) {
    this.contentConcluded = contentConcluded;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((contentSubscriptions == null) ? 0 : contentSubscriptions.hashCode());
    result = prime * result + ((contentConcluded == null) ? 0 : contentConcluded.hashCode());
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
    Developer other = (Developer) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (contentSubscriptions == null) {
      if (other.contentSubscriptions != null)
        return false;
    } else if (!contentSubscriptions.equals(other.contentSubscriptions))
      return false;
    if (contentConcluded == null) {
      if (other.contentConcluded != null)
        return false;
    } else if (!contentConcluded.equals(other.contentConcluded))
      return false;
    return true;
  }
}
