package petstore.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import petstore.models.Tag;

public class Constants {
  private static final String photoUrl = "www.photoUrl.com";

  public static final Long DEFAULT_PET_ID = 3L;
  public static final String DEFAULT_PET_NAME = "PetName";
  public static final Long DEFAULT_CATEGORY_ID = 0L;
  public static final String DEFAULT_CATEGORY_NAME = "CategoryName";
  public static final Long DEFAULT_TAG_ID = 4L;
  public static final String DEFAULT_TAG_NAME = "TagName";
  public static final List<String> DEFAULT_PHOTO_URLS = Collections.singletonList(photoUrl);
  public static final List<String> DEFAULT_EMPTY_LIST = new ArrayList<String>();
  public static final List<Tag> DEFAULT_TAGS = Collections.singletonList(Tag.builder().build());
  public static final List<Tag> DEFAULT_EMPTY_TAG_LIST = new ArrayList<Tag>();

  public static final Integer DEFAULT_RESPONSE_CODE = 1;
  public static final String DEFAULT_RESPONSE_TYPE = "DefaultResponseType";
  public static final String DEFAULT_RESPONSE_MESSAGE = "DefaultResponseMessage";

  private Constants(){}
}
