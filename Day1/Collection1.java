package Day1;
import java.util.*;
public class Collection1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(78);
        queue.add(21);
        queue.add(45);
        System.out.println(queue.peek());
        System.out.println("Adding elements to the queue");
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
}
