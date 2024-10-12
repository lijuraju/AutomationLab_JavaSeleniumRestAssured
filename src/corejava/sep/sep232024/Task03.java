package corejava.sep.sep232024;

public class Task03 {
    public static void main(String[] args) {
        int conversionChoice = 1;

        switch (conversionChoice) {
            case 1 -> System.out.println("Celsius to Fahrenheit");
            case 2 -> System.out.println("Fahrenheit to Celsius");
            default -> System.out.println("Invalid choice");
        }
    }
}
