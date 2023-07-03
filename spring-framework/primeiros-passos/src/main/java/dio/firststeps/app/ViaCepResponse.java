package dio.firststeps.app;

public class ViaCepResponse {
  private String cep;
  private String address;
  private String location;

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "ViaCepResponse [cep=" + cep + ", address=" + address + ", location=" + location + "]";
  }
}
