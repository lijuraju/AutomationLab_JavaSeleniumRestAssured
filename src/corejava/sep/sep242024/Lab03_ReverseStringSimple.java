package corejava.sep.sep242024;

import java.util.Scanner;

public class Lab03_ReverseStringSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine().toLowerCase();
        sc.close();

        String reversed = "";

        for (int i =input.length()-1;i>=0;i--)
        {
            reversed = reversed + input.charAt(i);

        }
        System.out.println("Reversed String: " + reversed);

    }
}
