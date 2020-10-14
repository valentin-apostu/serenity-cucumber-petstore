package petstore.steplibs;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import java.util.Map;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.util.EnvironmentVariables;
import petstore.utilities.Converters;

public class BaseApiService {
  private EnvironmentVariables environmentVariables;

  public String getBaseUrl() {
    return EnvironmentSpecificConfiguration.from(environmentVariables)
        .getProperty("BASE.URL");
  }

  protected RequestSpecification setUp() {
    return SerenityRest
              .given()
                .log().all()
                .contentType(ContentType.JSON)
                .header("Content-Type", ContentType.JSON);
  }

  public Map getResponse() {
    return Converters.mapToMapOfStrings(SerenityRest.lastResponse().getBody().as(Map.class));
  }

  public <T> T getResponse(Class<T> type) {
    return SerenityRest.lastResponse().getBody().as(type);
  }
}