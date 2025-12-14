package hexlet.code;

import hexlet.code.exercise3.InMemoryKV;
import hexlet.code.exercise3.KeyValueStorage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class TestExercise3 {

    KeyValueStorage storage = new InMemoryKV(Map.of("key", "value"));

    @Test
    @DisplayName("Class InMemoryKV: get()")
    public void getTest() {
        var actual = storage.get("key", "default");
        var actualDefault = storage.get("sey", "default");
        assertEquals("value", actual);
        assertEquals("default", actualDefault);
    }

    @Test
    @DisplayName("Class InMemoryKV: set() and unset()")
    public void setTest() {
        storage.set("key2", "value2");
        var actual = storage.get("key2", "default");
        assertEquals("value2", actual);

    }

    @Test
    @DisplayName("Class InMemoryKV: unset()")
    public void unsetTest() {
        storage.unset("key");
        assertNull(storage.get("key", null));
    }

    @Test
    @DisplayName("Class InMemoryKV: toMap()")
    public void toMapTest() {
        var actual = storage.toMap();
        assertEquals("{key=value}", actual.toString());
    }

    @Test
    @DisplayName("Class App: swapKeyValue()")
    public void swapKeyValueTest() {
        storage.set("key2", "value2");
        App.swapKeyValue(storage);

        assertEquals("default", storage.get("key3", "default"));
        assertEquals("key", storage.get("value",  "default"));
        assertEquals("key2", storage.get("value2", "default"));

    }

    @Test
    @DisplayName("Class App: swapKeyValue()")
    public void swapKeyValueTest2() {
        KeyValueStorage storage = new InMemoryKV(Map.of("foo", "bar", "bar", "zoo"));
        App.swapKeyValue(storage);
        Map<String, String> expected = Map.of("bar", "foo", "zoo", "bar");

    }
    @Test
    void inMemoryKVTest() {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));

        assertEquals(storage.get("key2", "default"), "default");
        assertEquals(storage.get("key", "default"), "10");

        storage.set("key2", "value2");
        storage.set("key", "value");

        assertEquals(storage.get("key2", "default"), "value2");
        assertEquals(storage.get("key", "default"), "value");

        storage.unset("key");

        assertEquals(storage.get("key", "def"), "def");
        assertEquals(storage.toMap(), Map.of("key2", "value2"));
    }

    @Test
    void mustBeImmutableTest() {
        Map<String, String> initial = new HashMap<>();
        initial.put("key", "10");

        Map<String, String> clonedInitial = new HashMap<>();
        clonedInitial.putAll(initial);

        KeyValueStorage storage1 = new InMemoryKV(initial);
        initial.put("key2", "value2");

        assertEquals(clonedInitial, storage1.toMap());

        Map<String, String> map = storage1.toMap();
        map.put("key2", "value2");

        assertEquals(clonedInitial, storage1.toMap());
    }
}
