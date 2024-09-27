package corejava.sep272024;

public class Task01_WhileFactorial {
    public static void main(String[] args) {

        // 5 = 5*4*3*2*1 = 120

        int fact =1;
        int i=1;

        while(i<=5)
        {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of 5 is: " + fact);
    }
}
