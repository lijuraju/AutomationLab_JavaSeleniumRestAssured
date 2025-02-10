package corejava.Feb.Feb022025;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 100015;
        int temp = number;
        int rev = 0;
        int lastDigit;

        while (temp != 0) {

            lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;
        }

        System.out.println("Reverse of number is: " + rev);

        if (number == rev) {
            System.out.println("Number is palindrome");
        } else
            System.out.println("Number is not palindrome");
    }
}
