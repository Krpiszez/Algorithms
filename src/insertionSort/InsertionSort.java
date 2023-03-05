package insertionSort;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i =0; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = temp;
        }
    }

}
