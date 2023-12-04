package Queue;

public class ArrayImplementation {
    public static class queueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int [] arr = new int[5];

        public void add(int data){
            if(r == arr.length-1){ //Base case
                System.out.println("Queue is full!");
                return;
            }
            if(f == -1){ //Queue is currently Empty
                f = r = 0;
                arr[0] = data;
            }
            else { //Normal case
                arr[++r] = data;
            }
            size++;
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[f];
        }
        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
            }
            else{
                for(int i=f; i<=r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        queueA q1 = new queueA();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.display();
        q1.peek();
        q1.remove();
        q1.display();



    }
}
