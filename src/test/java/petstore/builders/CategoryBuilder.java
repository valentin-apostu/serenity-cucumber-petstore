package petstore.builders;

import petstore.models.Category;
import petstore.utilities.Constants;

public class CategoryBuilder {
  private Long id = Constants.DEFAULT_CATEGORY_ID;
  private String name = Constants.DEFAULT_CATEGORY_NAME;

  public CategoryBuilder withId(Long id){
    this.id = id;
    return this;
  }
  public CategoryBuilder withName(String name){
    this.name = name;
    return this;
  }
  public Category build(){
    return new Category(id, name);
  }
}