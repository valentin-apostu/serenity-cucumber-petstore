package petstore.steplibs;

import java.util.Map;
import net.serenitybdd.rest.SerenityRest;
import petstore.utilities.Converters;

public class PetResponse {
  public Map returned() {
    return Converters.mapToMapOfStrings(SerenityRest.lastResponse().getBody().as(Map.class));
  }
}
