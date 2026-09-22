//Write a Bubble Sort program that also counts the total number of swaps required to sort the array.

import java.util.Arrays;

public class bubbleCountSwap {
    static void main(String[] args) {
        int[] arr = {3,2,1,5,3,2,10,11};
        int ans =count(arr);
        System.out.println(ans);
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int count(int[] arr){
        int count =0;
        for(int i =0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    count++;

                }
            }
        }
        return count;

    }
    static void bubble(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
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
