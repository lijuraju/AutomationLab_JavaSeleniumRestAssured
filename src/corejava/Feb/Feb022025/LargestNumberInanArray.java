package corejava.Feb.Feb022025;

public class LargestNumberInanArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,10,20,9,30};

        int assumedLargest = array[0];

        for(int orginalLargest:array){

            if (orginalLargest > assumedLargest) {

                assumedLargest=orginalLargest;
            }
        }
        System.out.println("Largest number in array is: "+assumedLargest);
    }
}
