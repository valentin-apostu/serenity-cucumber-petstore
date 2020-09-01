package petstore.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Converters {

  public static String ObjectToJson(Object object) {
    ObjectMapper objectMapper = new ObjectMapper();

    try {
      return (objectMapper.writeValueAsString(object));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "";
  }

  public static Map<String, String> mapToMapOfStrings(Map<String, Object> map) {
    return map.entrySet()
        .stream()
        .collect(toMap(Map.Entry::getKey,
            entry -> entry.getValue().toString()));
  }

    public static Map<String, String> objectToMapOfStrings(Object object) {
    ObjectMapper objectMapper = new ObjectMapper();
    return mapToMapOfStrings(objectMapper.convertValue(object, Map.class));
  }

  public static Long convertToLong(Object o) {
    return Long.parseLong(String.valueOf(o));
  }
}