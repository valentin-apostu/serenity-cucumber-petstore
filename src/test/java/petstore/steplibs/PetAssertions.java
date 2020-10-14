package petstore.steplibs;

import java.util.Map;
import petstore.models.Pet;
import petstore.utilities.Converters;

import static org.assertj.core.api.Assertions.assertThat;

public class PetAssertions extends BaseAssertions {

  public void checkResponseValues(CreatePetService createPetService, Pet pet) {
    Map<String, String> actualResponse = createPetService.getResponse();
    Map<String, String> expectedResponse = Converters.objectToMapOfStrings(pet);

    expectedResponse.keySet().removeIf(key -> key.equals("id"));
    assertThat(actualResponse).as("All values from response (except id) match the ones from the request body ").containsAllEntriesOf(expectedResponse);
  }

  public void checkResponseValues(Pet actualPet, Pet expectedPet) {
    assertThat(actualPet).as("All values from response match the ones from the request body ").isEqualTo(expectedPet);
  }
}
