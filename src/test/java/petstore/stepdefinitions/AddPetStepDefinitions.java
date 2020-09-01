package petstore.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import net.thucydides.core.annotations.Steps;
import org.apache.http.HttpStatus;
import petstore.PetStoreEndpoints;
import petstore.builders.PetBuilder;
import petstore.models.Pet;
import petstore.steplibs.AddPet;
import petstore.steplibs.PetRequest;
import petstore.steplibs.PetResponse;
import petstore.utilities.Converters;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AddPetStepDefinitions extends BaseSteps {
  Pet pet;

  @Steps
  PetRequest petRequest;

  @Steps
  PetResponse petResponse;

  @Steps
  AddPet addPetToStore;

  @Given("a new pet")
  public void createPet() {
    pet = new PetBuilder().build();
    petRequest.withDefaults(pet);
  }

  @Given("a pet without a name")
  public void createPetWithoutAName() {
    pet = new PetBuilder().withoutName().build();
    petRequest.withDefaults(pet);
  }

  @Given("a pet without photos")
  public void createPetWithoutPhotos() {
    pet = new PetBuilder().withoutPhotoUrls().build();
    petRequest.withDefaults(pet);
  }

  @When("I add the pet to store")
  public void addPet() {
    addPetToStore.withDefaults(PetStoreEndpoints.PET.getUrl());
  }

  @When("I add the pet to store using a method that is not allowed")
  public void iAddThePetToStoreUsingAMethodThatIsNotAllowed() {
    addPetToStore.withNotAllowedMethod(PetStoreEndpoints.PET.getUrl());
  }

  @Then("the pet is added correctly")
  public void thePetIsAddedCorrectly() {
    restAssuredThat(response -> response
        .statusCode(HttpStatus.SC_OK));

    Map<String, String> actualResponse = petResponse.returned();
    Map<String, String> expectedResponse = Converters.objectToMapOfStrings(pet);

    expectedResponse.keySet().removeIf(key -> key.equals("id"));
    assertThat(actualResponse).as("All values from response (except id) match the ones from the request body ").containsAllEntriesOf(expectedResponse);
  }

  @Then("I receive a {int} HTTP error")
  public void iReceiveAnHttpError(int httpError){
    restAssuredThat(response -> response
        .statusCode(httpError)
    );
  }

  @Then("the response has type {string}")
  public void theResponseHasType(String type){
    restAssuredThat(response -> response
        .body("apiResponse.type", equalTo(type)));
  }
}