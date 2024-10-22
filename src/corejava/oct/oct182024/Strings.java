package corejava.oct.oct182024;

public class Strings {

    //Creating a String using String Literal and string is created in the String pool
  String s1 = "Liju";
  String s2 = "Liju";

  // Creating a String using New Keyword and string is created in the heap memeory
  String a1 = new String("Liju");
    String a2 = new String("Liju");



    public static void main(String[] args) {

        Strings s = new Strings();
        //This one is true because both s1 and s2 are pointing to the same memory location.JVM will check if the string is already present in the string pool
        // and if it is present it will not create a new object.
        System.out.println(s.s1 == s.s2);

        //This one is also true because it is checking the value or content or data
        System.out.println(s.s1.equals(s.s2));

        //This one is false because a1 and a2 are pointing to different memory locations
        System.out.println(s.a1 == s.a2);

        //common functions in Java
        System.out.println(s.a1.length());
        System.out.println(s.a1.charAt(0));
        System.out.println(s.a1.toLowerCase());
        System.out.println(s.a1.toUpperCase());
        System.out.println(s.a1.concat(s.a2));
    }
}
