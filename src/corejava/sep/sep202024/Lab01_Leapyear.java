package corejava.sep.sep202024;

import java.util.Scanner;

public class Lab01_Leapyear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        sc.close();

        if(year% 4 == 0 && year%100 != 0 ||  year%400 == 0)
        {
            System.out.println("Leap year");
        }
        else
        System.out.println("Not a leap year");
    }
}