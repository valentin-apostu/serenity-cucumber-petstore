package petstore.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import petstore.utilities.Constants;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
  @Builder.Default private Long id = Constants.DEFAULT_PET_ID;
  @Builder.Default private Category category = Category.builder().build();
  @Builder.Default private String name = Constants.DEFAULT_PET_NAME;
  @Builder.Default private List<String> photoUrls = Constants.DEFAULT_EMPTY_LIST;
  @Builder.Default private List<Tag> tags = Constants.DEFAULT_EMPTY_TAG_LIST;
  @Builder.Default private String status = StatusEnum.AVAILABLE.toString();

  public static class PetBuilder {
    private String name = Constants.DEFAULT_PET_NAME;
    private List<String> photoUrls = Constants.DEFAULT_EMPTY_LIST;

    public PetBuilder withoutName() {
      this.name = null;
      return this;
    }
    public PetBuilder withoutPhotoUrls() {
      this.photoUrls = null;
      return this;
    }
  }


  public enum StatusEnum {
    AVAILABLE("available"),
    
    PENDING("pending"),
    
    SOLD("sold");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
}

