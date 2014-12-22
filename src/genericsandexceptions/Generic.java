package genericsandexceptions;

import java.util.ArrayList;

public class Generic {

    public static void main(final String[] args) {

        // raw type
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(1);

        // RunTimeException due to wrong casting
        // String str1 = (String) arrayList1.get(0);

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("software testing");

        // compilation error because of wrong data type
        // arrayList2.add(1);
        // No explicit type casting is required
        String str2 = arrayList2.get(0);
        System.out.println(str2);

    }

}
