package Queue;

public class LLImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            else {
                return head.data;
            }
        }
        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            else {
                int x = head.data;
                head = head.next;
                size--;
                return x;
            }
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
            }
            else {
                Node temp = head;
                while (temp != null){
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        System.out.println("Size of Queue "+q.size);
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        q.remove();
        System.out.println(q.peek());
        q.remove();
        q.display();
        System.out.println("Now size of Queue "+q.size);



    }
}
