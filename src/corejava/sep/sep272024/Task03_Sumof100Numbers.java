package corejava.sep.sep272024;

public class Task03_Sumof100Numbers {
    public static void main(String[] args) {

        int i=1;
        int sum=0;

        while(i<=100){

            sum = sum + i;
            i++;
        }
        System.out.println("Sum of 1 to 5 is: " + sum);
    }
}
