import java.util.*;

//Modify the Bubble Sort algorithm to sort the array in descending order.
public class bubble2 {
    static void main(String[] args) {
        int[] arr ={7, 1, 4, 9, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =1;j<arr.length-i;j++) {
                if (arr[j] > arr[j - 1]) {
                    swap(arr, j, j - 1);
                }

            }
        }

        }
        static void swap(int[] arr,int first,int second){
            int temp =arr[first];
            arr[first] =arr[second];
            arr[second]=temp;
    }
}
