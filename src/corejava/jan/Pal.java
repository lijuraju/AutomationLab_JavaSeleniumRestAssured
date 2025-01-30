package corejava.jan;

public class Pal {
    //121

    public static void main(String[] args) {
        int number = 1215;
        int lastdigit = 0;
        int reverse = 0;

        int temp = number;

        while (number > 0) {
            lastdigit = number % 10;
            reverse = reverse * 10 + lastdigit;
            number = number / 10;
        }

        if(temp == reverse){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a palindrome");

    }
}