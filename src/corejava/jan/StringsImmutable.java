package corejava.jan;

public class StringsImmutable {

    public static void main(String[] args) {

  String str1 = "hello";
  String str2 = str1;
        //Initially, str1 and str2 refer to the same String object in the String Pool
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        //When str1 = str1 + " World"; is executed, a new String object is created
        str1 = str1 + "world";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }

}
