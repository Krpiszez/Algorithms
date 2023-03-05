package bigO;

public class BigOn2 {

    public static void main(String[] args) {

        // add each element of array to other elements, including itself
        int count = 0;
        int [] arr = {1,4,6}; // 1+1, 1+4, 1+6, 1+4, 4+4, 4+6, 6+1, 6+6

        for (int i=0; i<arr.length; i++){
            for (int k = 0; k<arr.length; k++){
                System.out.println(arr[i] + arr[k]);
                count++;
            }
        }
        System.out.println(count);

    }

}
