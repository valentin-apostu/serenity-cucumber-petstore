package petstore.utilities;

import java.util.Collections;
import java.util.List;
import petstore.builders.TagBuilder;
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
  public static final List<Tag> DEFAULT_TAGS = Collections.singletonList(new TagBuilder().build());

  public static final String CONTENT_TYPE = "application/json";

  public static final Long DEFAULT_USER_ID = 2L;
  public static final String DEFAULT_USERNAME = "username";
  public static final String DEFAULT_FIRSTNAME = "firstname";
  public static final String DEFAULT_EMAIL = "email@email.com";
  public static final String DEFAULT_PASSWORD = "password";
  public static final String DEFAULT_PHONE = "0611111111";
  public static final Integer DEFAULT_USER_STATUS = 5;

  public static final String CONFIGURATION_FILE = "src/test/resources/configurations/configurations.json";
  public static final String DEFAULT_ENVIRONMENT = "qa";
  public static final String ENVIRONMENT= "env";
  public static final String BASE_URL_KEY = "baseUrl";
  private Constants(){}
}
