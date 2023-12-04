package Queue;

public class CircularQueueArray {
    public static class Cqa{
        int front = -1;
        int rear = -1;
        int size = 0;
        int [] arr = new int[4];
        public void add(int val) throws Exception{
            if(size == arr.length){
                throw new Exception("Queue is Full!");
            }
            else if(size == 0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear < arr.length-1){
                arr[++rear] = val;
            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        public int peek() throws Exception {
            if(size == 0){
                throw new Exception("Queue is Empty!");
            }
            else return arr[front];
        }
        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty!");
            }
            else {
                int val = arr[front];
                if (front == arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
            }
            else if(front<=rear){
                for (int i=front; i<rear; i++){
                    System.out.print(arr[i]+ " ");
                }
            }
            else {
                for(int i=front; i<arr.length; i++){
                    System.out.print(arr[i]+ " ");
                }
                for(int i=0; i<=rear; i++){
                    System.out.print(arr[i]+ " ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception {
        Cqa c = new Cqa();
        c.display();
        c.add(1);
        c.add(2);
        c.add(3);
        c.display();
        c.remove();
        System.out.println("The top most element of Queue is : "+c.peek());
        c.display();
        c.add(4);
        c.add(5);
        c.display();
        for (int i=0; i<c.arr.length; i++){
            System.out.print(c.arr[i]+" ");
        }




    }
}
