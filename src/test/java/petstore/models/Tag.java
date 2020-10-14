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
public class Tag   {
  @Builder.Default private Long id = Constants.DEFAULT_TAG_ID;
  @Builder.Default private String name = Constants.DEFAULT_TAG_NAME;
}

