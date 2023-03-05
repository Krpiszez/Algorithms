package selectionSort;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        // {7, 4, 5, 9, 8, 2, 1}
        for (int i=0; i<arr.length; i++){
            int index = i;
            for (int k = i+1; k<arr.length; k++){
                if (arr[k] < arr[index]){
                    index = k;
                }
            }

            int smallerNumber  = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;

        }
    }
}
