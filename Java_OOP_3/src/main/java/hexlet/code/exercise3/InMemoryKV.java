package hexlet.code.exercise3;

import java.util.HashMap;
import java.util.Map;


public class InMemoryKV implements KeyValueStorage {

    private Map<String, String> map = new HashMap<>();

    public InMemoryKV(Map<String, String> initial) {

        map.putAll(initial);

    }

    public void set(String key, String value) {
        map.put(key, value);
    }

    public void unset(String key) {
        map.remove(key);
    }
    public String get(String key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(map);
    }
}
