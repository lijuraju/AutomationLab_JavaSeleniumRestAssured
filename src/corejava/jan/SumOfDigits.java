package corejava.jan;

public class SumOfDigits {

    int number = 1234;
    int sum = 0;

    public static void main(String[] args) {


        int number = 1234;
        int sum = 0;

        while(number>0)
        {
            int lastdigit = number%10;
            sum = sum + lastdigit;
            number = number/10;
        }
        System.out.println("Sum of digits is" + sum);

    }
}
