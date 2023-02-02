import java.util.*;
public class RemoveElements {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        //Adding elements to the set..
        //By using add method..
        System.out.println("After adding elements into set: ");
        set.add("Sai");
        set.add("Bharath");
        set.add("Sandeep");
        set.add("Ayyapa");
        System.out.println(set);
        System.out.println("After removing elements form the set: ");
        //remove element from set..
        set.remove("Sai");

        set.add("Null");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
