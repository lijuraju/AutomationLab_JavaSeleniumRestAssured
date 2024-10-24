package corejava.oct.oct242024;

public class WrapperClass {

    public static void main(String[] args) {
        //Autoboxing;

        //Automatic conversion of primitive data type to its corresponding wrapper class

        int a = 20;
        Integer obj = a; //Autoboxing int into Integer

        //Unboxing

        Integer obj2 = 10;
        int b = obj2;

        //useful methods
        //parseInt(String s)
        //toString9int i)

        String numberStr = "123";
        int number = Integer.parseInt(numberStr);

        System.out.println(number);

    }
}
