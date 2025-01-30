package corejava.jan;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,2,1};

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<array.length;i++)
        {
            set.add(array[i]);
        }
        System.out.println(set);
    }
}
