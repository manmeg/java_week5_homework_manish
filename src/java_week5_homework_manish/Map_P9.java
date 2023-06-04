package java_week5_homework_manish;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Map_P9 {

    public static void main(String[] args)
    {
        store();
    }
    public static void store()
    {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("coins", 5);
        items.put("pens", 2);
        items.put("chairs", 7);


        for (Map.Entry<String, Integer> pair: items.entrySet())
        {
            System.out.format("key: %s, value: %d%n", pair.getKey(), pair.getValue());
        }
    }

}