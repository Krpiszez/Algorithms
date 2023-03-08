package quickSort;

public class QuickSort02 {

    public static int partition(int[] arr, int bot, int top){
        int pivot = arr[top];
        int i = bot-1;
        for (int j = bot; j<top; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i+1];
        arr[i+1] = arr[top];
        arr[top] = temp;

        return i+1;
    }

    public static void quickSort(int[] arr, int bot, int top){

        if (bot<top){
            int pi = partition(arr, bot, top);
            quickSort(arr, bot, pi-1); // works recursively for left part of pivot
            quickSort(arr, pi+1, top);
        }

    }

}
