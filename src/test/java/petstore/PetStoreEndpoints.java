package petstore;

public enum PetStoreEndpoints {
  PET_UPLOAD_IMAGE("/pet/%s/uploadImage"),
  PET("/pet"),
  PET_BY_ID("/pet/%s"),
  PET_FIND_BY_STATUS("/pet/findByStatus");

  private final String url;

  PetStoreEndpoints(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }
}