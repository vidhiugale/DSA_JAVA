
import java.util.*;

public class LinkedList1 {

    public static void main(String args[]) {

        LinkedList<Integer> l = new LinkedList();    //create LinkedList with integer type variable name l
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println("LinkedList Elements are:" + l);       //Printing LinkedList
        System.out.println("Size of LinkedList:" + l.size());     //Size of LinkedList
        System.out.println("Element at index 2:" + l.get(2));    //Accessing element at index 2
        System.out.println("Check if 20 is present: " + l.contains(20)); //Checking if 20 present in LinkedList
        System.out.println("Removing element 30 from LinkedList: " + l.remove(3)); //Removing element from LinkedList
        System.out.println("Final LinkedList is : " + l);
    }

}
