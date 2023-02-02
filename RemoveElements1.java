import java.util.*;
public class RemoveElements1 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        System.out.println("After adding elements into set: ");
        //Adding elements into set
        set.add("Sandeep");
        set.add("Bharath");
        set.add("Ayyapa");
        set.add("Surya");
        System.out.println(set);
        System.out.println("After remove element from set: ");
        //Remove an element from set..
        set.remove("Ayyapa");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
