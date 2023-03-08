package quickSort;

public class QuickSort {

    public static void quickSort(int[] arr, int lowIndex, int highIndex){
        // select pivot
        int pivot = arr[highIndex];

        // define left and right pointers.
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer<rightPointer){
            while (arr[leftPointer]<=pivot && leftPointer<rightPointer){
                leftPointer++;
            }
            while (arr[rightPointer]>=pivot && leftPointer<rightPointer){
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        //we are swapping pivot with element pointed by left pointer.
        swap(arr, leftPointer, highIndex);
        // call the method recursively for the subarray smaller than pivot(left side)
        quickSort(arr, lowIndex, leftPointer-1);
        // call the method recursively for the subarray greater than pivot(right side)
        quickSort(arr, leftPointer+1, highIndex);

    }

    private static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
