package OOPs;

public class StudentClass {

//    public static void fun(Student s1){
//        System.out.println(s1.name);
//    }

//    public static void change(int x){
//        x = 7;
//        return;
//    }
    public static void change(Student s3){
        s3.name = "Laxman";
        return;
    }
    public static class Car{
         String name;
         String type;
         int price;
    }
    public static void main(String[] args) {

//  If we can make a constructor we can't use this method it shows error NO ARGUMENTS FOUND
//        Student s1 = new Student();
//        s1.name = "Bharat";
//        //s1.rno = 148; //We can make the rno private, so it can be accessed by getter and setters
//        s1.setRno(148);
//        s1.percent = 81.3;
//        System.out.println(s1.getRno());




        //By using Constructor we have to declare all the fields in same line or pass the ARGUMENTS
        Student s1 = new Student("Bharat", 148, 92.1);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
        System.out.println(s1.schoolName); //If we use final keyword we cannot change its value
        System.out.println(s1.numberOfStudents);


//
        Student s2 = new Student("Ram", 10, 99);
//        s2.name = "Rahul";
//        s2.rno = 100;
//        s2.percent = 80.3;
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.percent);
        System.out.println(s2.numberOfStudents);


//        Car x = new Car();
//        x.name = "Ferrari";
//        x.type = "F2";
//        x.price = 120000000;



        /*We can make a class outside the main method. If we make a class inside the main it can't be accessed outside
        main*/
       // fun(s2);



        /*Function are pass by value it's mean if we change the value in the function it does not change its actual
         value {But in case of array it will change because there is pass by Reference}*/
//        int x;
//        x = 5;
//        System.out.println(x);
//        change(x);
//        System.out.println(x);



        /*What in case with Class */
//        Student s3 = new Student();
//        s3.name = "Ram";
//        //s3.rno = 1;
//        s3.percent = 90;
//        System.out.println(s3.name);



        /*It means the classes are also pass by Reference*/
//        change(s3);
//        System.out.println(s3.name);

    }
}
