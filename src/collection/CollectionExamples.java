package collection;

import java.util.*;

/**
 * @author  tbhadauria <tarun.kumar.bhadauria@zalando.de>
 */
public class CollectionExamples {

    public static void main(final String[] args) {

        // List interface using ArrayList implementation
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("selenium");
        arrayList.add("webdriver");
        arrayList.add("webdriver"); // duplicate value and array list will store it

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
        for (Iterator<String> iterator = arrayList.listIterator(); iterator.hasNext();) {
            System.out.println("List element is: " + iterator.next());
        }

        // Set interface and HashSet implementation
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(2); // duplicate value but set with store it only once
        set.add(3);

        // iterate using iterator
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("Iterating through Set using iterator");
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
            System.out.println("Set element is: " + iterator.next());

        }
        
        // Map interface using HashMap implementation
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Web driver");
        map.put(2, "Selenium RC");
        map.put(3, "Selenium Grd");
    }

}
