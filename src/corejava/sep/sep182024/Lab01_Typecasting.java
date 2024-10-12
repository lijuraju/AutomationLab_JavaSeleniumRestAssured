package corejava.sep.sep182024;

public class Lab01_Typecasting {
    public static void main(String[] args) {
 //Type Casting
        //1)Widening

        byte a = 100;

        int b = a;//Implicit or Automatic Type Casting

        int c = (int) a;//Explicit Type Casting


        //Narrowing

        int x = 178;

        //byte y = x; //Invalid Implicit type casting

        byte z = (byte) x; //Explicit Type casting

        System.out.println(z);

        int course = 100;
        float gst = 18.45f;

        int total = (int) (course + gst);

        System.out.println(total);






    }
}
