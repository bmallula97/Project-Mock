package Day1;
import java.util.*;

public class RemoveElements {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(36);
        queue.add(45);
        queue.add(21);
        System.out.println("After removing the element");
      queue.remove(45);
        Iterator it = queue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
