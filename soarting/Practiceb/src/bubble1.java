import java.util.Arrays;

//Write a program to sort an array of integers in ascending order using Bubble Sort.
public class bubble1 {
    static void main(String[] args) {
        int [] arr ={5,3,8,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){

        for(int i =0;i<=arr.length-1;i++) {     // hear we are not creating an index range we are crating number of time passes req to sort
            for(int j =1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }

    }
    static void swap(int[] arr ,int first,int second){
        int temp =arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }
}
