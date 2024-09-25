package corejava.sep242024;

import java.util.Scanner;

public class Lab01_ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        String reveresed = new StringBuilder(input).reverse().toString();
        System.out.println("Reveresed String" + reveresed);

    }
}
