package petstore;

public enum PetStoreEndpoints {
  PET("/pet");

  private final String url;

  PetStoreEndpoints(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }
}