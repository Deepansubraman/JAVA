import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // put() - Add key-value pairs
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Initial Map: " + map);

        // putAll() - Copy all elements from another map
        LinkedHashMap<String, Integer> anotherMap = new LinkedHashMap<>();
        anotherMap.put("Four", 4);
        anotherMap.put("Five", 5);
        map.putAll(anotherMap);
        System.out.println("After putAll: " + map);

        // getOrDefault() - Get a value or return a default
        System.out.println("Get 'Two': " + map.getOrDefault("Two", 0));
        System.out.println("Get 'Six' (default): " + map.getOrDefault("Six", 0));

        // putIfAbsent() - Add a key only if absent
        map.putIfAbsent("Six", 6);
        System.out.println("After putIfAbsent: " + map);

        // compute() - Modify a value based on a computation
        map.compute("Two", (key, val) -> val == null ? 0 : val + 10);
        System.out.println("After compute: " + map);

        // computeIfAbsent() - Compute if absent
        map.computeIfAbsent("Seven", key -> 7);
        System.out.println("After computeIfAbsent: " + map);

        // computeIfPresent() - Compute if present
        map.computeIfPresent("One", (key, val) -> val * 2);
        System.out.println("After computeIfPresent: " + map);

        // containsKey() - Check if a key exists
        System.out.println("Contains key 'Three': " + map.containsKey("Three"));

        // replace() - Replace value of a key
        map.replace("Three", 30);
        System.out.println("After replace: " + map);

        // replaceAll() - Replace all values
        map.replaceAll((key, val) -> val * 2);
        System.out.println("After replaceAll: " + map);

        // remove() - Remove a key or a key-value pair
        map.remove("Four");
        System.out.println("After remove (key): " + map);
        map.remove("Five", 10);
        System.out.println("After remove (key-value pair): " + map);

        // merge() - Merge a value
        map.merge("One", 100, Integer::sum);
        System.out.println("After merge: " + map);

        // size() - Get size
        System.out.println("Size: " + map.size());

        // isEmpty() - Check if empty
        System.out.println("Is empty: " + map.isEmpty());

        // forEach() - Iterate using forEach
        System.out.println("Using forEach:");
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        // clear() - Remove all entries
        map.clear();
        System.out.println("After clear: " + map);

        // equals() - Compare maps
        LinkedHashMap<String, Integer> newMap = new LinkedHashMap<>();
        newMap.put("A", 1);
        newMap.put("B", 2);
        System.out.println("Equals: " + map.equals(newMap));

        // hashCode() - Get hash code
        System.out.println("Hash code: " + newMap.hashCode());

        // toString() - Convert map to string
        System.out.println("Map as String: " + newMap.toString());
    }
}