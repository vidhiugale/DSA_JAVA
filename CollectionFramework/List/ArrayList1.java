
import java.util.ArrayList;

public class ArrayList1 {

    public static void ArrayMet() {
        ArrayList<Integer> l = new ArrayList();    //create ArrayList with integer type variable name l
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println("ArrayList Elements are:" + l);       //Printing Arraylist
        System.out.println("Size of ArrayList:" + l.size());     //Size of Arraylist
        System.out.println("Element at index 2:" + l.get(2));    //Accessing element at index 2
        System.out.println("Check if 20 is present: " + l.contains(20)); //Checking if 20 present in Arraylist
        System.out.println("Removing element 30 from ArrayList: " + l.remove(3)); //Removing element from ArrayList
        System.out.println("Final ArrayList is : " + l);
    }

    public static void main(String[] args) {
        ArrayMet();
    }
}
