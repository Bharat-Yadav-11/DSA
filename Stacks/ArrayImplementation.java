package Stacks;

public class ArrayImplementation {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        void display(){
            for(int i=0; i<=idx-1; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        boolean isFull(){
            if(idx == arr.length) return true;
            else return false;
        }
        boolean isEmpty(){
            if(idx == 0) return true;
            else return false;
        }

        int size(){
            return idx;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
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
//        st.push(60);
//        st.display();

        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();

        System.out.println(st.peek());
        st.pop();
        st.display();

        System.out.println(st.size());





    }
}
