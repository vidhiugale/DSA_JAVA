
import java.util.*;

public class DequeueExample {

    public static void main(String args[]) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(3);  //add element from front 
        dq.addFirst(2); //add element from front
        dq.addLast(4); //add element from last
        dq.addLast(5); //add element from last
        System.out.println("Deque is:" + dq);
        System.out.println("First element is: " + dq.getFirst()); //acess first element
        System.out.println("Last element is: " + dq.getLast()); //acess last element
        System.out.println("Remove First element is: " + dq.removeFirst()); //acess first element
        System.out.println("Deque after removing first element is: " + dq); //acess first element
    }
}
