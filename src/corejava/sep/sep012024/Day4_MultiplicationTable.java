package corejava.sep.sep012024;

import java.util.Scanner;

public class Day4_MultiplicationTable {

    //here u can take 2 inputs
    //which multiplication table and what is the limit

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Multiplication table number");
        int mul = sc.nextInt();

        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        for(int i =1; i<=limit; i++){

            System.out.println(mul + " * " + i + " = " + mul* i);
        }
    }
}
