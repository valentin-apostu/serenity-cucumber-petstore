package petstore.models;

import java.util.List;
import lombok.Data;

@Data
public class Pet {
  private Long id;
  private Category category;
  private String name;
  private final List<String> photoUrls;
  private final List<Tag> tags;
  private String status;

  public Pet(Long id, Category category, String name, List<String> photoUrls, List<Tag> tags, String status) {
    this.id = id;
    this.category = category;
    this.name = name;
    this.photoUrls = photoUrls;
    this.tags = tags;
    this.status = status;
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

