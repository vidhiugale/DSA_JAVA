
import java.util.*;

public class StackExample {

    public static void main(String[] args) {
        {
            Stack<String> st = new Stack();
            st.push("First");      //Add element into stack
            st.push("Second");
            st.push("Third");
            st.push("Fourth");
            System.out.println("Stack is: " + st);
            System.out.println("Top element is: " + st.peek());  //Acess top element
            System.out.println("Popped element: " + st.pop());  //Remove top element
            System.out.println("Stack size is:" + st.size());  //Get stack size
            System.out.println("Final stack is:" + st);   //Print final stack
        }
    }
}
