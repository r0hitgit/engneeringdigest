import java.util.Arrays;

public class findSecondLargest {
    static void main(String[] args) {
        int[] arr = {10,5,20,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(secondLargest(arr));
    }
    static int secondLargest(int[] arr){
        sort(arr);
        int result=0;
        for(int i =0;i<arr.length-1;i++){
            result =arr[arr.length-2];
        }
        return result;
    }
    static void sort(int[] arr){
        for(int i =0;i<=arr.length-1;i++){
            for(int j =1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp =arr[first];
        arr[first] =arr[second];
        arr[second] =temp;
    }
}
