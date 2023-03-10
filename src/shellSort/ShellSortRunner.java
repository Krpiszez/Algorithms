package shellSort;

import mergeSort.MergeSort;

import java.util.Arrays;
import java.util.Random;

public class ShellSortRunner {

    public static void main(String[] args) {

        Random rn = new Random();
        int[] arr = new int[10000];
        for (int i=0; i< arr.length; i++){
            arr[i] = rn.nextInt(10000);
        }
        System.out.println("**********BEFORE**********");
        System.out.println(Arrays.toString(arr));
        ShellSort.shellSort(arr);
        System.out.println("**********AFTER**********");
        System.out.println(Arrays.toString(arr));

    }
}
