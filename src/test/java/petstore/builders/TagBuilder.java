package petstore.builders;

import petstore.models.Tag;
import petstore.utilities.Constants;

public class TagBuilder {
  Long id = Constants.DEFAULT_TAG_ID;
  String name = Constants.DEFAULT_TAG_NAME;

  public TagBuilder withId(Long id){
    this.id = id;
    return this;
  }
  public TagBuilder withName(String name){
    this.name = name;
    return this;
  }
  public Tag build(){
    return new Tag(id, name);
  }
}
