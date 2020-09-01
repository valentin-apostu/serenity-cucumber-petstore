package petstore.steplibs;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import petstore.models.Pet;
import petstore.stepdefinitions.BaseSteps;

import static petstore.utilities.Constants.CONTENT_TYPE;

public class PetRequest extends BaseSteps{

  @Step
  public void withDefaults(Pet pet) {
    SerenityRest.given()
        .log().all()
        .contentType(CONTENT_TYPE)
        .header("Content-Type", CONTENT_TYPE)
        .baseUri(BASE_URL)
        .body(pet);
  }
}