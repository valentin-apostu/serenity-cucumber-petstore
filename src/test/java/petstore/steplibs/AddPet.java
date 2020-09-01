package petstore.steplibs;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import petstore.stepdefinitions.BaseSteps;

import static petstore.utilities.Converters.convertToLong;

public class AddPet extends BaseSteps {

  @Steps
  PetResponse petResponse;

  @Step
  public Long withDefaults(String url) {
    SerenityRest
        .when()
        .post(url);

    return convertToLong(petResponse.returned().get("id"));
  }

  @Step
  public void withNotAllowedMethod(String url) {
    SerenityRest
        .when()
        .get(url);
  }
}
