package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        String[] arrayName = {"a","b","c"};
        System.out.println(arrayName);
        System.out.println(Arrays.toString(arrayName));
        //create list of strings
        List<String> names = new ArrayList<>();

        //add elements to the string
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");
        names.add("Alice"); //allows duplicates
        System.out.println(names);

        //Access elements
        System.out.println("First name: " + names.get(0));


        System.out.println("---iterate through list using for each---");
        for(String name: names){
            System.out.println(name);
        }

        System.out.println("---iterate using for loop---");
        for(int i = 0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("---change an item---");
        names.set(3,"Dennis");
        System.out.println(names);

        //remove an item
        names.remove(3);
        System.out.println(names);

        //array size
        int size = names.size();
        System.out.println(size);

        //contains
        boolean isContain = names.contains("Alice");
        System.out.println(isContain);

        //check the list is empty
        boolean check = names.isEmpty();
        System.out.println(check);

        //sort an arrayList-for sorting lists alphabetically or numerically
        Collections.sort(names);
        System.out.println(names);

        //clear all items
        names.clear();
        System.out.println(names);
    }
}
