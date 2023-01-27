package Day2;
import java.util.*;
public class Performance {
    //Method to insert elements into HashSet
    private static void InsertionHashSet() {
        HashSet<String> set = new HashSet<>();
        set.add("Sai");
        set.add("Bharath");
        set.add("Sandeep");
        set.add("Ayyapa");
        System.out.println("Insertion of Hashset: " + set);
    }
    //Method to insert elements into HashSet
    private static void InsertionLinkHash() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Sai");
        set.add("Bharath");
        set.add("Sandeep");
        set.add("Ayyapa");
        System.out.println("Insertion of Linked HashSet: " + set);
    }
    //Method to calculate timee to insert 2000 objects into HashSet
    private static void InsertionTimeCal() {
        HashSet<Integer> set = new HashSet<>();
        long Start = System.nanoTime();
        for (int i = 0; i < 2000; i++) {
            set.add(i);
        }
        long End = System.nanoTime();
        System.out.println("Time taken to insert 2000 objects into HashSet in seconds: ");
        System.out.println(End - Start);
    }
    //Method to calculate timee to insert 2000 objects into LinkedHashSet
    private static void InsertionTimeCalLinkHash() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        long Start = System.nanoTime();
        for (int i = 0; i < 2000; i++) {
            set.add(i);
        }
        long End = System.nanoTime();
        System.out.println("Time taken to insert 2000 objects into LinkedHashSet in seconds: ");
        System.out.println(End - Start);
    }

        public static void main(String[] args) {
        InsertionHashSet();
        InsertionLinkHash();
        InsertionTimeCal();
        InsertionTimeCalLinkHash();

    }

    
}
