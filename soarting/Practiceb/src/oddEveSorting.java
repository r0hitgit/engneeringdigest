import java.util.Arrays;

//Sort array so that all even numbers come first, then odd numbers — while maintaining relative order (stable).
public class oddEveSorting {
    static void main(String[] args) {
        int[] arr ={3,1,2,4};
        OddEveSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void OddEveSort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =1;j<arr.length-i;j++){
                if(arr[j]%2==0 && arr[j-1]%2!=0){        // as the bubble sort see its adjacent element and perform the operation so it preserve the default order never jump to the element randomly
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second]=temp;
    }
}
/* prefer bubble sort when we have to prevent the relative order it automatically do this
Stable algorithm

No random swaps

Prefer:

Bubble Sort

Insertion Sort
*/
