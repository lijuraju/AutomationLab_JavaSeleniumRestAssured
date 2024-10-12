package corejava.sep.sep012024;

import java.util.Scanner;

public class Day4_Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();
        sc.close();

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;

        }

            if (isPalindrome) {
                System.out.println("Palindrome String");
            } else {
                System.out.println("Not a palindrome");
            }

        }

    }




