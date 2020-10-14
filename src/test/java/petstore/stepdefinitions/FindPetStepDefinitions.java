package petstore.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import petstore.models.Pet;
import petstore.steplibs.CreatePetService;
import petstore.steplibs.FindPetService;
import petstore.steplibs.PetAssertions;

public class FindPetStepDefinitions {

  Pet createdPet;
  Pet foundPet;
  Long createdPetId;

  @Steps
  CreatePetService createPetService;
  @Steps
  FindPetService findPetService;
  @Steps
  PetAssertions assertions;

  @Given("an id of a pet from store")
  public void findPetId() {
    createdPet = Pet.builder().build();
    createdPetId = createPetService.create(createdPet);
  }

  @When("I search the pet by id")
  public void searchPetById() {
    foundPet = findPetService.byId(createdPetId);
  }
  @When("I search the pet by id using a method that is not allowed")
  public void searchPetByIdWithNotAllowedMethod() {
    findPetService.byId(createdPetId);
  }

  @Then("the correct pet is found")
  public void theCorrectPetIsFound() {
    assertions.checkStatusCode();
    assertions.checkResponseValues(foundPet, createdPet);
  }
}
