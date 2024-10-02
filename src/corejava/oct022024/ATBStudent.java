package corejava.oct022024;

public class ATBStudent {

    //data members
   int sid;
   int age;
   String name;
   String className;
   String schoolName;
   String houseAddress;
   String adharCardNumber;

   //member functions
   void study(){
         System.out.println("Student is studying");
   }
   void play(){
         System.out.println("Student is playing");
   }
   void  eat(){
            System.out.println("Student is eating");
   }
   void sleep(){
            System.out.println("Student is sleeping");

   }
    void display(){
         System.out.println("Student ID: " + sid);
         System.out.println("Student Name: " + name);
         System.out.println("Student Age: " + age);
         System.out.println("Student Class: " + className);
         System.out.println("Student School Name: " + schoolName);
         System.out.println("Student House Address: " + houseAddress);
         System.out.println("Student Adhar Card Number: " + adharCardNumber);
    }

    public static void main(String[] args) {

       //Object creation
        ATBStudent student1 = new ATBStudent();
        student1.sid = 101;
        student1.age = 10;
        student1.name = "Raj";
        student1.className = "5th";
        student1.schoolName = "ATB School";
        student1.houseAddress = "Pune";
        student1.adharCardNumber = "123456789";

        student1.display();
        student1.study();
        student1.play();
        student1.eat();
        student1.sleep();

        ATBStudent student2 = new ATBStudent();
        student2.sid = 102;
        student2.age = 11;
        student2.name = "Ravi";
        student2.className = "6th";
        student2.schoolName = "ATB School";
        student2.houseAddress = "Mumbai";
        student2.adharCardNumber = "123456789";

        student2.display();
        student2.study();
        student2.play();
        student2.eat();
        student2.sleep();

    }

}
