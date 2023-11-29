package OOPs;

public class Student {
        String name;
        int rno;
        double percent;
        final String schoolName = "KRMU"; //By using final keyword we cannot change its value

        /*If we Dont't use static word than number of students does not increase
        i.e numberOfStudents are remains 1 */
         // int numberOfStudents;
        static int numberOfStudents;



       /* public Student(String naam, int roll, double percentage){ //To make a constructor we can use this Syntax
                name = naam;
                rno = roll;
                percent = percentage;
        } */

        public Student(String name, int rno, double percent){ //Use the this. keyword for declare variables without changing their name
                this.name = name;
                this.rno = rno;
                this.percent = percent;
               // this.schoolName = schoolName; //It will show an error we cannot assign value to final keyword
                numberOfStudents++;
        }

        public int getRno(){ //Getter
                return rno;
        }
        public void setRno(int rno){ //setter
                this.rno = rno;
        }
}
