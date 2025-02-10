package corejava.Feb.Feb022025;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madami".toLowerCase();

        boolean isPalindrome = true;
        int length = str.length();

        for (int i = 0; i <= length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }


        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        }
            else
                System.out.println("Not a Palindrome");
        }
    }

