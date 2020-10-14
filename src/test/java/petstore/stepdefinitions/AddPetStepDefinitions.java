package petstore.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import petstore.models.Pet;
import petstore.steplibs.CreatePetService;
import petstore.steplibs.PetAssertions;

public class AddPetStepDefinitions {

  Pet addedPet;
  @Steps
  CreatePetService createPetService;

  @Steps
  PetAssertions assertions;

  @Given("a new pet")
  public void createPet() {
    addedPet = Pet.builder().build();
  }

  @Given("a pet without a name")
  public void createPetWithoutAName() {
    addedPet = Pet.builder().withoutName().build();
  }

  @Given("a pet without photos")
  public void createPetWithoutPhotos() {
    addedPet = Pet.builder().withoutPhotoUrls().build();
  }

  @When("I add the pet to store")
  public void addPet() {
    createPetService.create(addedPet);
  }

  @When("I add the pet to store using a method that is not allowed")
  public void iAddThePetToStoreUsingAMethodThatIsNotAllowed() {
    createPetService.createWithNotAllowedMethod(addedPet);
  }

  @Then("the pet is added correctly")
  public void thePetIsAddedCorrectly() {
    assertions.checkStatusCode();
    assertions.checkResponseValues(createPetService, addedPet);
  }

  @Then("I receive a {int} HTTP error")
  public void iReceiveAnHttpError(int httpError){
    assertions.checkStatusCode(httpError);
  }

  @Then("the response has type {string}")
  public void theResponseHasType(String type){
    assertions.checkResponseType(type);
  }
}