package corejava.sep012024;

public class Day4_FizzBuzz {

    //Print numbers from 1 to 100
    //If the number is divisible by 3, print "Fizz"
    //If the number is divisible by 5, print "Buzz"
    //If the number is divisible by 3 and 5, print "FizzBuzz"

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");

            } else
                System.out.println(i);
        }
    }
}
