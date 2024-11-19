package corejava.nov.nov192024;

import java.util.Arrays;

public class FrequencyOfNumber {
    public static void main(String[] args) {

//declaration with intialization
        int[] array1 = {1, 2, 1, 2, 3, 2, 4, 3,4,5};


        //Sorting the array
        Arrays.sort(array1);

        // Initialize current number and count
        int currentnumber = array1[0];
        int count = 1;

        for (int i = 1; i < array1.length; i++) {
            if (array1[i] == currentnumber) {
                count++; // Increment count for the same number
            } else {
                // Print frequency of the previous number
                System.out.println("Number " + currentnumber + " appears " + count + " times.");
                currentnumber = array1[i]; // Update to the new number
                count = 1; // Reset count
            }
        }

        // Print frequency for the last number
        System.out.println("Number " + currentnumber + " appears " + count + " times.");
    }
}






