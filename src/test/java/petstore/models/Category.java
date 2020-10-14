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
public class Category {
  @Builder.Default private Long id = Constants.DEFAULT_CATEGORY_ID;
  @Builder.Default private String name = Constants.DEFAULT_CATEGORY_NAME;
}