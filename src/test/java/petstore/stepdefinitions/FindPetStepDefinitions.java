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
import petstore.steplibs.SearchPet;
import petstore.utilities.Converters;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.assertj.core.api.Assertions.assertThat;

public class FindPetStepDefinitions {

  Pet pet;
  Long petId;

  @Steps
  PetRequest petRequest;

  @Steps
  PetResponse petResponse;

  @Steps
  AddPet addPetToStore;

  @Steps
  SearchPet searchPet;

  @Given("an id of a pet from store")
  public void findPetId() {
    pet = new PetBuilder().build();
    petRequest.withDefaults(pet);
    petId = addPetToStore.withDefaults(PetStoreEndpoints.PET.getUrl());
  }

  @When("I search the pet by id")
  public void searchPetById() {
    searchPet.byId(PetStoreEndpoints.PET.getUrl(), petId);
  }
  @When("I search the pet by id using a method that is not allowed")
  public void searchPetByIdWithNotAllowedMethod() {
    searchPet.byId(PetStoreEndpoints.PET.getUrl(), petId);
  }

  @Then("the correct pet is found")
  public void theCorrectPetIsFound() {
    restAssuredThat(response -> response
        .statusCode(HttpStatus.SC_OK));

    Map<String, String> actualResponse = petResponse.returned();
    Map<String, String> expectedResponse = Converters.objectToMapOfStrings(pet);
    assertThat(actualResponse).as("All values from response (except id) match the ones from the request body ").containsAllEntriesOf(expectedResponse);
  }
}
