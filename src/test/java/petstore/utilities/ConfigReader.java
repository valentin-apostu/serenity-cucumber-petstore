package petstore.utilities;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import org.springframework.util.StringUtils;

public class ConfigReader {
  public static final String BASE_URL = getConfigReader().get(Constants.BASE_URL_KEY).asText();
  private static JsonNode jsonNode;

  public static JsonNode getConfigReader() {
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      jsonNode = objectMapper.readTree(new File(Constants.CONFIGURATION_FILE));
      jsonNode = jsonNode.get(getBaseUrl());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return jsonNode;
  }

  public static String getBaseUrl() {
    return StringUtils.isEmpty(System.getProperty(Constants.ENVIRONMENT)) ?
        Constants.DEFAULT_ENVIRONMENT : System.getProperty(Constants.ENVIRONMENT);
  }
}
