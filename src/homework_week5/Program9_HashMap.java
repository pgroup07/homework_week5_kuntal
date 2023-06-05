package homework_week5;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Program9_HashMap {
    public static void main(String[] args) {
        map(); //Calling method
    }

    public static void map() {
        Map<String, Integer> people = new HashMap<>();  //Hashmap obj created
        people.put("Kapil", 1);
        people.put("Janak", 2);
        people.put("Nency", 3);
        people.put("Jaimini", 4);
        people.put("Chintan", 5);
        for (Map.Entry<String, Integer> map : people.entrySet()) //iterate value from map
        {
            System.out.println(map.getKey() + " " + map.getValue());  //print elements from collection
        }
    }
}
