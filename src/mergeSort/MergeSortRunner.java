package mergeSort;

import java.util.Arrays;
import java.util.Random;

public class MergeSortRunner {

    public static void main(String[] args) {

        Random rn = new Random();
        int[] arr = new int[10000];
        for (int i=0; i< arr.length; i++){
            arr[i] = rn.nextInt(10000);
        }
        System.out.println("**********BEFORE**********");
        System.out.println(Arrays.toString(arr));
        MergeSort.mergeSort(arr);
        System.out.println("**********AFTER**********");
        System.out.println(Arrays.toString(arr));

    }
}
