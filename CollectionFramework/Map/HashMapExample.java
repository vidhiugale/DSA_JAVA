
import java.util.*;

public class HashMapExample {

    public static void main(String args[]) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Vidhi");
        hm.put(3, ",Mitali");
        hm.put(5, "Pooja");
        hm.put(4, "Meena");
        System.out.println("HashMap is:" + hm);
        System.out.println("Value at index 2 is: " + hm.get(2));
        System.out.println("Give size: " + hm.size());
        System.out.println("Is hashMap Empty: " + hm.isEmpty());

        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + "->" + e.getValue());
        }

    }
}
