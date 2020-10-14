package petstore.steplibs;

import petstore.PetStoreEndpoints;
import petstore.models.Pet;

public class FindPetService extends BaseApiService {

  public Pet byId(Long id) {
    setUp()
        .when()
        .get(this.getBaseUrl() + String.format(PetStoreEndpoints.PET_BY_ID.getUrl(),id));

    return getResponse(Pet.class);
  }
}
