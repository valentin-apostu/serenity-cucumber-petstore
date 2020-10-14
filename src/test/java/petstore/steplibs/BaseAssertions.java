package petstore.steplibs;

import org.apache.http.HttpStatus;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class BaseAssertions {

  public void checkStatusCode() {
    restAssuredThat(response -> response
        .statusCode(HttpStatus.SC_OK));
  }
  public void checkStatusCode(int statusCode) {
    restAssuredThat(response -> response
        .statusCode(statusCode));
  }
  public void checkResponseType(String type) {
    restAssuredThat(response -> response
        .body("apiResponse.type", equalTo(type)));
  }
}
