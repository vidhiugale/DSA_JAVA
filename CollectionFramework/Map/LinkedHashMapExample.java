
import java.util.*;

public class LinkedHashMapExample {

    public static void main(String args[]) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(1, "Vidhi");
        hm.put(3, ",Mitali");
        hm.put(5, "Pooja");
        hm.put(4, "Meena");
        System.out.println("LinkedHashMap is:" + hm);
        System.out.println("Value at index 2 is: " + hm.get(2));
        System.out.println("Give size: " + hm.size());
        System.out.println("Is LinkedHashMap Empty: " + hm.isEmpty());

        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + "->" + e.getValue());
        }

    }
}
