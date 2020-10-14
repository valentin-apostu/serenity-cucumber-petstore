package petstore.steplibs;

import petstore.PetStoreEndpoints;
import petstore.models.Pet;

public class CreatePetService extends BaseApiService {

  public Long create(Pet pet) {
    setUp()
          .body(pet)
        .when()
          .post(this.getBaseUrl() + PetStoreEndpoints.PET.getUrl());

    return getResponse(Pet.class).getId();
  }

  public void createWithNotAllowedMethod(Pet pet) {
    setUp()
        .body(pet)
        .when()
        .get(this.getBaseUrl() + PetStoreEndpoints.PET.getUrl());
  }



}