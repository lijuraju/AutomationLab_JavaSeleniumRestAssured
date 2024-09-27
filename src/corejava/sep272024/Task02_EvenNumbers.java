package corejava.sep272024;

public class Task02_EvenNumbers {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
