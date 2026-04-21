
import java.util.*;

public class MinPriorityExample {

    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();   //Min value
        pq.add(20);
        pq.add(34);
        pq.add(11);
        pq.add(5);
        System.out.println("Priority Queue: " + pq);
        System.out.println("Head element is: " + pq.peek());  //Access head element
        System.out.println("Removed element: " + pq.poll()); //Remove element
        System.out.println("Final Priority Quesue is: " + pq);

    }
}
