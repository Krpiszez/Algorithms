package quickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSortRunner {

    public static void main(String[] args) {

        Random rn = new Random();
        int[] arr = new int[100];
        for (int i =0; i<arr.length; i++){
            arr[i] = rn.nextInt(1000);
        }

        System.out.println(Arrays.toString(arr));
        QuickSort.quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        int[] brr = new int[100];
        for (int i =0; i<brr.length; i++){
            brr[i] = rn.nextInt(1000);
        }
        System.out.println(Arrays.toString(brr));
        QuickSort02.quickSort(brr, 0, brr.length-1);
        System.out.println(Arrays.toString(brr));

    }

}
