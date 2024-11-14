package app;

import java.util.HashMap;
import java.util.Map;

public class DataRepository {
    private final Map<Integer, String> map = new HashMap<>();
    public DataRepository() {
        map.put(387, "Lucy");
        map.put(231, "Alice");
        map.put(394, "Bob");
        map.put(172, "Tom");
    }
    public Map<Integer, String> getData() {
        return map;
    }
}

