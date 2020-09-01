package petstore.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
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

