package corejava.jan;

public class palindrome {

    public static void main(String[] args) {

        int num = 121;

        int reverse = 0;

        int temp  = num;

        while(num>0)
        {
        int lastdigit = num%10;
        reverse = reverse*10 + lastdigit;
        num = num/10;


    }
        if(temp == reverse)
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a palindrome");
    }
}
