package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(final String[] args) {

        // Map interface using HashMap implementation
        Map<Integer, String> map = new HashMap<Integer, String>();

        // add elements to map
        map.put(1, "Web driver");
        map.put(2, "Selenium RC");
        map.put(3, "Selenium Grid");
        map.put(3, "selenium Remote control"); // duplicate key, hence map will store only this latest key

        // using base methods
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Size of map: " + map.size());
        System.out.println("Is map empty: " + map.isEmpty());
        System.out.println("Does map contain key '3': " + map.containsKey(3));
        System.out.println("Does map contain value 'Selenium RC': " + map.containsValue("Selenium RC"));
        System.out.println("Does map contain value 'QTP': " + map.containsValue("QTP"));

        // iterating using for each loop
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Iterating through map using for each loop");
        for (Integer key : map.keySet()) {
            System.out.println("Map key is: " + key);
            System.out.println("Map value is: " + map.get(key));
        }

        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Remove key from map and print values again");
        map.remove(3);
        for (Integer key : map.keySet()) {
            System.out.println("Map key is: " + key);
            System.out.println("Map value is: " + map.get(key));
        }

        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Add two maps and print values");

        Map<Integer, String> newHashMap = new HashMap<Integer, String>();
        newHashMap.put(10, "TestLink");
        newHashMap.put(11, "JMeter");

        map.putAll(newHashMap);

        for (Integer key : map.keySet()) {
            System.out.println("Map key is: " + key);
            System.out.println("Map Value is: " + map.get(key));
        }
    }
}
