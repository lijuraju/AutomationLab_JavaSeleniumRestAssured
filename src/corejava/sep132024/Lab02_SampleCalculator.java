package corejava.sep132024;

import java.util.Scanner;

public class Lab02_SampleCalculator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);
        sc.close();

        switch (operator) {
            case '+':
                System.out.println("Sum of " + a + "and" + b + "is " + a+b);
                break;
            case '-':
                System.out.println("Sub of " + a + " and" + b + " is " + (a-b));
                break;
            case '*':
                System.out.println("Multiplication of " + a + " and" + b + " is " + (a*b));
                break;
            case '/':
                System.out.println("Divison of " + a + " and" + b + " is " + (a/b));
                break;
            case '%':
                System.out.println("Remainder of " + a + " and" + b + "is " + (a%b));
                break;
            default:
                System.out.println("I am not able to handle the query at this moment");
                break;


        }



    }
}
