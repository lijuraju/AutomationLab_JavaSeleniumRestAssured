package corejava.Feb;

public class LargestNumberInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int larg = arr[0];

        for(int largest:arr){

            if(largest>larg){
                larg = largest;
            }
        }
        System.out.println("Largest number in array is: "+larg);
    }
}
