import java.util.Arrays;

public class reverseArray {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr){
    //two pointer approach
        for(int i =0;i<=arr.length-1;i++){
            for(int j =1;j< arr.length-i;j++){
                if(arr[j]>arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    i++;
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second){
            int temp =arr[first];
            arr[first] =arr[second];
            arr[second] = temp;
        }
    }


