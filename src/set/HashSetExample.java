package set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Prado");
        cars.add("BMW");
        System.out.println(cars); // even though BMW is added twice it only appears once in the set because every item in a set has to be unique.

        System.out.println(cars.size());

        boolean isTrue = cars.contains("Volvo");
        System.out.println(isTrue);

        cars.remove("Prado");
        System.out.println(cars);

        for (String i: cars){
            System.out.println(i);
        }

        cars.clear();
        System.out.println(cars);
    }
}
