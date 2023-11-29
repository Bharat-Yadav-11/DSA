package Stacks;

public class LLImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class LLStack{
        Node head = null;
        int size = 0;

        void push(int data){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
        }

        int peek(){
            if(head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.data;
        }
        int pop(){
            if(head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;

        }

//        void displayReverse(){
//            Node temp = head;
//            while (temp != null){
//                System.out.print(temp.data+" ");
//                temp = temp.next;
//            }
//            System.out.println();
//        }
        void displayRec(Node h){
            if(h == null) return;
            displayRec(h.next);
            System.out.print(h.data+" ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        int size(){
            return size;
        }

    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println("The size of Stack is: "+st.size());
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println("The size of Stack is: "+st.size());






    }
}
