package Stacks;

import java.util.Stack;
public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(10);
        System.out.println("Top element of stack is : "+st.peek()); // Print top element of stack
        System.out.println("Your stack is : "+st); // Print all elements of stack
        System.out.println("Size of stack is : "+st.size()); // Print size of stack
        System.out.println();

        System.out.println("After pop the STACK is : ");
        st.pop(); // Remove the top element of the stack
        System.out.println("Top element of stack is : "+st.peek()); // Print top element of stack
        System.out.println("Your stack is : "+st); // Print all elements of stack
        System.out.println("Size of stack is : "+st.size()); // Print size of stack
        System.out.println("Is stack Empty : "+st.isEmpty());
    }
}
