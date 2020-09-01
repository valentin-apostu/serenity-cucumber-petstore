package petstore.steplibs;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import petstore.stepdefinitions.BaseSteps;

import static petstore.utilities.Converters.convertToLong;

public class SearchPet extends BaseSteps {
    @Steps
    PetResponse petResponse;

    @Step
    public Long byId(String url, Long id) {
      SerenityRest.when()
          .get(url + "/" + id.toString());

      return convertToLong(petResponse.returned().get("id"));
    }
}
