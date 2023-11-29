package LinkedList;

public class lec123 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step1 --> create new node object
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 --> newNode next = head
        newNode.next = head;

        //step3 --> head = newNode
        head = newNode;
    }
    public void addLast(int data){
        //step1 --> create new node object
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 --> tail.next = newNode
        tail.next = newNode;

        //step3 --> tail = newNode
        tail = newNode;
    }
    public static void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        lec123 ll = new lec123();
        ll.addFirst(2);
        print();
        ll.addFirst(1);
        print();
        ll.addLast(3);
        print();
        ll.addLast(4);
        print();

    }
}
