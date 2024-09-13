package corejava;

import java.util.Scanner;

public class Day4_TriangleClassifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a==b && b == c && a == c)
        {
            System.out.println("Equilateral traingle");
        }
        else if (a == b || b == c || a == c)
        {
            System.out.println("Isosceles traingle");
        }
        else
        {
            System.out.println("Scalene traiangle");
        }
    }
}
