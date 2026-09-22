//Reverse string
import java.util.*;
public class lc344 {
    static void main(String[] args) {

        String[] arr={"H","a","n","n","a","h"};
        revers(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void revers(String[] arr) {
//        for(int i =0;i<=(arr.length-1)/2;i++){
//            swap(arr,i,arr.length-1-i);
//        }
//    }
//    static void swap(String[] arr,int first, int second){
//        String temp = arr[first];
//        arr[first]=arr[second];
//        arr[second]= temp;
//    }


        //optimizing it
        int left =0;
        int right=arr.length-1;
        while(left<right){
            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }
}
