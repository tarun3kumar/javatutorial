package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(final String[] args) {

        // Set interface and HashSet implementation
        Set<Integer> hashSet = new HashSet<Integer>();

        // add elements to set
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2); // duplicate value but set with store it only once
        hashSet.add(8);
        hashSet.add(6);
        hashSet.add(4);

        // using base methods
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Size of set: " + hashSet.size());
        System.out.println("Is set empty: " + hashSet.isEmpty());
        System.out.println("Does set contain object '3': " + hashSet.contains(3));

        // iterating using for each loop
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Iterating through Set using for each loop");
        for (Integer set : hashSet) {
            System.out.println("Set element is: " + set);
        }

        // iterate using iterator
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Iterating through Set using iterator");

        for (Iterator<Integer> iterator = hashSet.iterator(); iterator.hasNext();) {
            System.out.println("set element is: " + iterator.next());
        }

        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("remove element and print Set");

        hashSet.remove(3);

        for (Integer set : hashSet) {
            System.out.println("Set element is: " + set);
        }

        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Add two set collections and print values");

        Set<Integer> newHashSet = new HashSet<Integer>();
        newHashSet.add(10);
        newHashSet.add(11);
        hashSet.addAll(newHashSet);

        for (Integer set : hashSet) {
            System.out.println("Set element is: " + set);
        }
    }
}
