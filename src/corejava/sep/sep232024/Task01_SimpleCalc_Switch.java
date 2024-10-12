package corejava.sep.sep232024;

import java.util.Scanner;

public class Task01_SimpleCalc_Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);

//        char op = sc.next().charAt(0);
//
//        System.out.println("Enter your name");
//        String name = sc.next();


        switch (operator)
        {
            case '+':
                System.out.println("Add"+ (num1+num2));
                break;
            case '-':
                System.out.println("Sub" + (num1-num2));
                break;

            case'*':
                System.out.println("Mul" + (num1*num2));
                break;
            case '/':
                System.out.println("Div" + (num1/num2));
                break;
            case '%':
                System.out.println("Mod" + (num1%num2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }


    }
}
