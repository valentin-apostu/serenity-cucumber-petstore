package petstore.utilities;

import java.util.Collections;
import java.util.List;
import petstore.builders.TagBuilder;
import petstore.models.Tag;

public class Constants {
  private static final Tag tag = new TagBuilder().build();
  public static final String DEFAULT_PET_NAME = "PetName";
  public static final Long DEFAULT_CATEGORY_ID = 0L;
  public static final String DEFAULT_CATEGORY_NAME = "CategoryName";
  public static final Long DEFAULT_TAG_ID = 1L;
  public static final String DEFAULT_TAG_NAME = "TagName";
  public static final List<String> DEFAULT_PHOTO_URLS = Collections.emptyList();
  public static final List<Tag> DEFAULT_TAGS = Collections.singletonList(tag);

  public static final String CONTENT_TYPE = "application/json";

  private Constants(){}
}
