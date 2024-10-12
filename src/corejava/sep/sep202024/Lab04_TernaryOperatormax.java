package corejava.sep.sep202024;

public class Lab04_TernaryOperatormax {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 20;
        int num3 = 30;


        int max = (num1>num2) ? (num1>num3?num1:num3) : (num2>num3?num2:num3);
        System.out.println("Max is: "+max);
    }
}
