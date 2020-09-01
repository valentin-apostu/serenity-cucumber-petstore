package petstore.models;

import lombok.Data;

@Data
public class ModelApiResponse {
  private Integer code;
  private String type;
  private String message;

  public ModelApiResponse(Integer code, String type, String message) {
    this.code = code;
    this.type = type;
    this.message = message;
  }
}

