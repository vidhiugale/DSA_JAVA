
import java.util.*;

public class QueueExample {

    public static void main(String args[]) {
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(10);  //Add element into queue
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println("Queue is: " + q);
        System.out.println("Head element:" + q.peek());  //Acess head element
        System.out.println("Removed element:" + q.poll()); //Remove element
        System.out.println("Final Queue: " + q);
    }
}
