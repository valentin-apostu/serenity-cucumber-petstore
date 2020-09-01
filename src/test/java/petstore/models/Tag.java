package petstore.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tag   {
  private Long id;
  private String name;
}

