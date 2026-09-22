import java.util.Arrays;

public class optimizeInsertion {
    static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8};
        boolean ans = OptimizeInsertion(arr);
        if(ans){
            System.out.println("Array is already sorted ");
        }else{
            System.out.println("Array is not sorted");
        }
        System.out.println("Sorted Array "+Arrays.toString(arr));
    }
    static boolean OptimizeInsertion(int[] arr) {
        boolean  isSorted=true;     // assume array is already sorted
        // if the array is sorted then first element is already sorted by default so we start from i=1
        for (int i = 1; i <=arr.length - 1; i++) {
            if (arr[i] <arr[i-1]) {
                isSorted =false;
                // if the arrays is not sorted then we sort it
                for(int j=i;j>0;j--){
                    if(arr[j]<arr[j-1]){
                        swap(arr,j,j-1);
                    }else{
                        break;
                    }
                }
            }
        }
        return isSorted;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
