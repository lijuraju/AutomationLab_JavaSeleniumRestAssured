package corejava.sep.sep252024;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            if (i %2 == 0) {
                System.out.println("Even: " + i);
                continue;

            }
            System.out.println("Odd: " + i);
            System.out.println("Liju");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a char: ");
            char c = sc.next().charAt(0);
        }
    }
}
