package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(final String[] args) {

        // List interface using ArrayList implementation
        List<String> arrayList = new ArrayList<String>();

        // add elements array list
        arrayList.add("selenium");
        arrayList.add("webdriver");
        arrayList.add("webdriver"); // duplicate value and array list will store it

        // using base methods
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Size of array: " + arrayList.size());
        System.out.println("Is array empty: " + arrayList.isEmpty());
        System.out.println("Does array list contain object 'webdriver': " + arrayList.contains("webdriver"));

        // iterating using for each loop
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Iterating through ArrayList using for each loop");
        for (String str : arrayList) {
            System.out.println("List element is: " + str);
        }

        // iterate using iterator
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Iterating through ArrayList using iterator");

        for (Iterator<String> iterator = arrayList.iterator(); iterator.hasNext();) {
            System.out.println("List element is: " + iterator.next());
        }

        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("remove element and print array list");

        arrayList.remove("webdriver");
        for (String str : arrayList) {
            System.out.println("List element is: " + str);
        }

        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Add two array lists and print values");

        List<String> newArrayList = new ArrayList<String>();
        newArrayList.add("selenium grid");
        newArrayList.add("selenium RC");
        arrayList.addAll(newArrayList);

        for (String str : arrayList) {
            System.out.println("List element is: " + str);
        }

    }
}
