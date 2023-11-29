package LinkedList;

public class Implementation {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class linkedList {
        Node head = null;
        Node tail = null;

        void insertAtBegin(int data) {
            Node temp = new Node(data);
            if (head == null){ //empty list
                head=tail=temp;
            } else { //non-empty list
                temp.next = head;
                head = temp;
            }
        }
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) { //empty list
                head = temp;
            } else { //non-empty list
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAt(int idx, int data){
            Node t = new Node(data);
            Node temp = head;

            if(idx == size()){
                insertAtEnd(data);
                return;
            } else if (idx == 0) {
                insertAtBegin(data);
                return;
            } else if (idx < 0 || idx > size()) {
                System.out.println("Invaild Index");
                return;
            }
            for(int i=1; i<=idx-1; i++){
            temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
     linkedList ll = new linkedList();
     ll.insertAtEnd(40);
     ll.insertAtEnd(50);
     ll.insertAtEnd(60);
     ll.display();
     ll.insertAtBegin(10);
     ll.insertAtBegin(20);
     ll.display();
     ll.insertAt(0,3);
     ll.insertAt(6,5);
     ll.display();
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);






    }
}
