package petstore.builders;

import petstore.models.User;
import petstore.utilities.Constants;

public class UserBuilder {
  Long id = Constants.DEFAULT_USER_ID;
  String username = Constants.DEFAULT_USERNAME;
  String firstName = Constants.DEFAULT_FIRSTNAME;
  String email = Constants.DEFAULT_EMAIL;
  String password = Constants.DEFAULT_PASSWORD;
  String phone = Constants.DEFAULT_PHONE;
  Integer userStatus = Constants.DEFAULT_USER_STATUS;

  public UserBuilder withId(Long id){
    this.id = id;
    return this;
  }
  public UserBuilder withUsername(String username){
    this.username = username;
    return this;
  }
  public UserBuilder withFirstname(String firstName){
    this.firstName = firstName;
    return this;
  }
  public UserBuilder withEmail(String email){
    this.email = email;
    return this;
  }
  public UserBuilder withPassword(String password){
    this.password = password;
    return this;
  }
  public UserBuilder withPhone(String phone){
    this.phone = phone;
    return this;
  }
  public UserBuilder withUserStatus(String userStatus){
    this.username = userStatus;
    return this;
  }
  public User build(){
    return new User(id, username, firstName, email, password, phone, userStatus);
  }
}