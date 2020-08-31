package petstore.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class User   {
  private Long id;
  private String username;
  private String firstName;
  private String email;
  private String password;
  private String phone;
  private Integer userStatus;
}

