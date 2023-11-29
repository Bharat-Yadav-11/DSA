package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); //push function in queue --> add()
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        //pop function in queue --> remove(), poll()
        q.remove();
        System.out.println(q);
        q.poll(); //pop function in queue
        System.out.println(q);
       // peek function in queue --> peek(), element()
        System.out.println("Top element of Queue "+q.peek());







    }
}
