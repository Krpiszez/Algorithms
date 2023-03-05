package bigO;

public class BigO1 {
    public static void main(String[] args) {
        // print last element of arr
        int [] arr = {4,6,8,9,0,4,1};
        System.out.println(arr[arr.length-1]); // here it doesnt depend on input size. Here it is bigO ?

        // task: check if the given num is even or odd
        int x = 34;
        if (x%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
