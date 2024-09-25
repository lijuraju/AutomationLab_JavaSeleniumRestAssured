package corejava.sep252024;

import java.util.Scanner;

public class Lab01_ReverseSentence {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a sentence");
//        String input = sc.nextLine().replaceAll("\\s","");
//        System.out.println("Input Sentence: " + input);
//        sc.close();

        String input = "Hello World";
        input = input.replaceAll("\\s","");
        System.out.println("Input Sentence: " + input);

        String reversed = "";

        for(int i = input.length()-1; i>=0; i--)
        {
            reversed = reversed + input.charAt(i);
        }
        System.out.println("Reversed Sentence: " + reversed);
    }
}
