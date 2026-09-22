//Sort First K Elements

import java.util.Arrays;

public class sortFirstKEle {
    static void main(String[] args) {
        int [] arr = {5, 4, 3, 2, 1};
        int k =3;
        SortFirstKEle(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    static void SortFirstKEle(int[] arr,int k ){
        for(int i =0;i<k-1;i++){   // this loop run for 2 time because we want two passes for sorting the arr therefore total number of passes req is k-1
            for(int j =1;j<k-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void swap(int[] arr , int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
