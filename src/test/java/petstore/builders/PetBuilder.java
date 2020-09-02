package petstore.builders;

import java.util.Collections;
import java.util.List;
import petstore.models.Category;
import petstore.models.Pet;
import petstore.models.Pet.StatusEnum;
import petstore.models.Tag;
import petstore.utilities.Constants;

public class PetBuilder {

  private Long id = Constants.DEFAULT_PET_ID;
  private Category category = new CategoryBuilder().build();
  private String name = Constants.DEFAULT_PET_NAME;
  private List<String> photoUrls = Constants.DEFAULT_PHOTO_URLS;
  private List<Tag> tags = Constants.DEFAULT_TAGS;
  private String status = StatusEnum.AVAILABLE.toString();

  public PetBuilder withId(Long id) {
    this.id = id;
    return this;
  }

  public PetBuilder withCategory(Category category) {
    this.category = category;
    return this;
  }

  public PetBuilder withName(String name) {
    this.name = name;
    return this;
  }
  public PetBuilder withoutName() {
    this.name = null;
    return this;
  }

  public PetBuilder withPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }
  public PetBuilder withoutPhotoUrls() {
    this.photoUrls = null;
    return this;
  }

  public PetBuilder withTag(List<Tag> tags) {
    this.tags = tags;
    return this;
  }
  public PetBuilder withoutTags() {
    this.tags = Collections.emptyList();
    return this;
  }

  public PetBuilder withStatus(String status) {
    this.status = status;
    return this;
  }

  public Pet build() {
    return new Pet(id, category, name, photoUrls, tags, status);
  }
}
