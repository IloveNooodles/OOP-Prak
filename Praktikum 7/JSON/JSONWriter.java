import java.lang.reflect.Field;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class JSONWriter {
  private Object o;

  public JSONWriter(Object o) {
    this.o = o;
  }

  public String mapToJSON(Map<String, String> jsonFieldMap) {
    String jsonString = jsonFieldMap
        .entrySet()
        .stream()
        .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
        .collect(Collectors.joining(","));

    return "{" + jsonString + "}";
  }

  public String toString() {
    Map<String, String> jsonFieldMap = new TreeMap<>();
    Field[] f = this.o.getClass().getDeclaredFields();
    for (Field field : f) {
      if (field.isAnnotationPresent(JSONField.class)) {
        try {
          field.setAccessible(true);
          jsonFieldMap.put((String) field.getName(), (String) field.get(this.o));
        } catch (Exception e) {

        }
      }
    }
    return mapToJSON(jsonFieldMap);
  }
}