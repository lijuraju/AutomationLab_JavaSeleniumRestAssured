package corejava.sep.sep272024;

import java.util.Scanner;

public class Task01_1_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Perform addition
                    System.out.println("Addition");
                    break;
                case 2:
                    // Perform subtraction
                    System.out.println("subtraction");
                    break;
                case 3:
                    // Perform multiplication
                    System.out.println("multiplication");
                    break;
                case 4:
                    // Perform division
                    System.out.println("division");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice!=5);
    }
}