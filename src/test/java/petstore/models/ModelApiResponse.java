package petstore.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import petstore.utilities.Constants;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModelApiResponse {
  @Builder.Default private Integer code = Constants.DEFAULT_RESPONSE_CODE;
  @Builder.Default private String type = Constants.DEFAULT_RESPONSE_TYPE;
  @Builder.Default private String message = Constants.DEFAULT_RESPONSE_MESSAGE;
}

