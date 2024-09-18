package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());

        //looping through iterator
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Use an iterator to remove numbers less than 10 from a collection:
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            Integer i = iterator.next();
            if(i < 12) {
                iterator.remove();
            }
        }
        System.out.println(numbers);

        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString);
        System.out.println(myString.length());
    }

}
