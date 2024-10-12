package corejava.sep.sep282024;


public class Task01_Primenumber1to3o {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            if (isPrimeCheck(i)) {
                System.out.println("Prime: " + i);
            } else {
                System.out.println("Not Prime: " + i);
            }
        }
    }

    private static boolean isPrimeCheck(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}




