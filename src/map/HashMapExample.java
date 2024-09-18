package map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        //HashMap- key,value
        HashMap<String,String> cities = new HashMap<>();
        cities.put("England","London");
        cities.put("Germany", "Berlin");
        cities.put("India", " new Delhi");
        System.out.println(cities);
        //Access item using key
        System.out.println(cities.get("England"));

        cities.remove("India");
        System.out.println(cities);

        System.out.println(cities.size());

        //Use the keySet() method if we want the keys, and use the values() method if we want the values:
        System.out.println("Printing only keys: ");
        for (String i: cities.keySet()){
            System.out.println(i);
        }
        System.out.println("Printing only values: ");
        for(String j: cities.values()){
            System.out.println(j);
        }
        System.out.println("Printing keys and values: ");
        for(String k: cities.keySet()){
            System.out.println("Key: " + k + " value: " + cities.get(k));
        }

        cities.clear();
        System.out.println(cities);

        HashMap<String, Integer> people = new HashMap<>();
        people.put("Bharath", 5);
        people.put("Parthiv", 2);
        System.out.println(people);

        for (String i: people.keySet()){
            System.out.println(i + " " +people.get(i));

        }
    }

}
