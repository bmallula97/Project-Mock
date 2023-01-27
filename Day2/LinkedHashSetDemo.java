package Day2;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        //Adding elements into set
        set.add("Sandeep");
        set.add("Bharath");
        set.add("Ayyapa");
        set.add("Surya");
        //Adding duplicate elements
        set.add("Surya");
        System.out.println("After adding elements into");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
