package corejava.oct.oct172024;

public class Staticblocks {

    static int count = 0;
    static int age = 25;

    static {
        count = 100;
        age = 225;
        System.out.println("Static block executed");

    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        System.out.println("Count is " + count);
        System.out.println("Age is " + age);
    }
}
