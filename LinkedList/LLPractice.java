package LinkedList;

public class LLPractice {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtBegin(int data){
            Node temp = new Node(data);
            if(head == null){
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
                size++;
            }
        }

        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
                size++;
            }
        }

        void insertAt(int idx, int data){
            Node t = new Node(data);
            Node temp = head;
            if(idx == 0){
                insertAtBegin(data);
                return;
            } else if(idx == size) {
                insertAtEnd(data);
                return;
            } else if(idx < 0 || idx > size) {
                System.out.println("Wrong Index");
                return;
            } else {
                for(int i=1; i<idx; i++){
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
                size++;
            }
        }

        void deleteAtBegin(){
            if(head == null){
                System.out.println("null");
                return;
            } else {
                head = head.next;
                size--;
            }
        }


       void deleteAtEnd(){
            if(head == null){
                System.out.println("List is Empty");
            }
            else {
                if(head != tail){
                    Node curr = head;
                    while(curr.next != tail){
                        curr = curr.next;
                    }
                    tail = curr;
                    tail.next = null;
                }
                else {
                    head = tail = null;
                }
                size--;
            }
        } 

        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtBegin(5);
        ll.insertAtBegin(4);
//        ll.display();
//        System.out.println("The size of linked list is: "+ll.size);
//        ll.insertAtEnd(6);
//        ll.insertAtEnd(7);
//        ll.display();
//        System.out.println("The size of linked list is: "+ll.size);
//        ll.insertAt(3,50);
        ll.display();
        ll.deleteAtBegin();
        ll.display();




    }
}
