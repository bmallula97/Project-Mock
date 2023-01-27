package Day2;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        //Adding elements to the set..
        //By using add method..

        set.add("Sai");
        set.add("Bharath");
        set.add("Sandeep");
        set.add("Ayyapa");
        //Adding duplicate elements

        set.add("Sandeep");
        set.add("Sai");
        //Adding Null value
        
        set.add("Null");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
