package corejava.sep252024;

public class Lab04_Primenumber {
    public static void main(String[] args) {

        int n =2;
        System.out.println(Math.sqrt(n));


        for (int i = 1; i <= 10; i++) {

            if (isPrime(i)) {
                System.out.println("Prime: " + i);
            } else {
                System.out.println("Not Prime: " + i);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}