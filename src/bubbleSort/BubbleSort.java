package bubbleSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int seed = 10000;
        Random rn = new Random(seed);
        int [] arr = new int[seed];
        for (int i = 0; i<seed; i++){
            arr[i] = rn.nextInt(1,100000);
        }

        System.out.println(Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        boolean swapped = false;
        do {
            swapped = false; // here this is added to prevent infinitive loop
            for (int i = 1; i<arr.length; i++){
                if (arr[i-1] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true;
                }
            }
        }while (swapped);
    }
}
