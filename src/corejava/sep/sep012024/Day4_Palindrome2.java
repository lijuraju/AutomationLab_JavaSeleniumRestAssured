package corejava.sep.sep012024;

import java.util.Scanner;

public class Day4_Palindrome2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine().toLowerCase();
        sc.close();

        int left = 0;
        int right = str.length() - 1;
        boolean ispalindrome = true;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                ispalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (ispalindrome) {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not a Palindrome String");

        }

    }
}
