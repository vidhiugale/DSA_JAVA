
import java.util.*;

public class TressSetExample {

    public static void main(String args[]) {
        TreeSet<Integer> hs = new TreeSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(10);
        hs.add(2); //duplicate element not allowed
        hs.add(9);
        hs.add(8);
        System.out.println("TreeSet is: " + hs);
    }
}
