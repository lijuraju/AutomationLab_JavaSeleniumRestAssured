package corejava.jan;

public class palindrome_2 {
    public static void main(String[] args) {

        int num = 234;
        int reverse = 0;
        int lastdigit;

        int temp = num;

        while(num>0)
        {
            lastdigit = num%10;
            reverse = reverse*10 + lastdigit;
            num = num/10;
        }

        System.out.println("Reverse of the number is "+reverse);

        if (temp == reverse)
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a palindrome");
    }
}
