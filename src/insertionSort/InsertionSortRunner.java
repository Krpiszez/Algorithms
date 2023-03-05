package insertionSort;

import java.util.Arrays;

public class InsertionSortRunner {
    public static void main(String[] args) {
        int arr[] = {9, 7, 6, 15, 17, 5, 10, 11};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        InsertionSort.insertionSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
