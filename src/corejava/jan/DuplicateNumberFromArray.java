package corejava.jan;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberFromArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,5,5,1,1};


        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length;i++)
        {
            set.add(arr[i]);
        }

        System.out.println(set);

    }



}
