package LinkedList;

public class basicsLL {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public static void main(String[] args) {
       //Create a new Node
       Node a = new Node(5);
       Node b = new Node(3);
       Node c = new Node(9);
       Node d = new Node(8);
       Node e = new Node(16);

       a.next = b; //5->3
       b.next = c; //5->3->9
       c.next = d; //5->3->9->8
       d.next = e; //5->3->9->8->16

        //This will show the linkedList is connected to each other
    /*    System.out.println(b); //LinkedList.basicsLL$Node@6d03e736
          System.out.println(a.next); //LinkedList.basicsLL$Node@6d03e736 */


    /*    System.out.print(a.data + " -> ");
        System.out.print(a.next.data + " -> ");
        System.out.print(a.next.next.data + " -> ");
        System.out.print(a.next.next.next.data + " -> ");
        System.out.print(a.next.next.next.next.data + " -> ");
        System.out.print(e.next+ " "); */

//        We can print data by using loop
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}