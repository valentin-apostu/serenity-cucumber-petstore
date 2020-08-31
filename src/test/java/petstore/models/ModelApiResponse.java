package petstore.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ModelApiResponse {
  private Integer code;
  private String type;
  private String message;
}

