import java.util.*;

public class Collection {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();

        queue.add("Bharath");
        queue.add("Samir");
        queue.add("Sandeep");
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}