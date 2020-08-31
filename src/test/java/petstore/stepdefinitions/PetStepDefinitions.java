package petstore.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import org.apache.http.HttpStatus;
import petstore.PetStoreEndpoints;
import petstore.builders.PetBuilder;
import petstore.models.Pet;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static petstore.utilities.Constants.CONTENT_TYPE;

public class PetStepDefinitions extends BaseSteps {

  Pet pet;

  @Given("a new pet")
  public void aNewPet() {
    pet = new PetBuilder().withoutTags().build();
    SerenityRest.given()
        .contentType(CONTENT_TYPE)
        .header("Content-Type", CONTENT_TYPE)
        .baseUri(baseUrl)
        .body(pet);
  }

  @When("I add the pet to store")
  public void iAddThePetToStore() {
    SerenityRest.when()
        .post(PetStoreEndpoints.PET.getUrl());
  }

  @When("I add the pet to store using a method that is not allowed")
  public void iAddThePetToStoreUsingAMethodThatIsNotAllowed() {
    SerenityRest.when()
        .get(PetStoreEndpoints.PET.getUrl());
  }

  @Then("the pet is added correctly")
  public void thePetIsAddedCorrectly() {
    restAssuredThat(response -> response
        .statusCode(HttpStatus.SC_OK)
        .body("name", equalTo(pet.getName()))
    );
  }

  @Then("I receive a {int} HTTP error")
  public void iReceiveAnHttpError(int httpError){
    restAssuredThat(response -> response
        .statusCode(httpError));
  }

  @Then("the response has type {string}")
  public void theResponseHasType(String type){
  }
}