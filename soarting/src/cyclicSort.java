import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr ={3,5,2,1,4};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void CyclicSort(int[] arr){
        int i=0;
        while(i< arr.length){
            int element =arr[i];
            int correctIndex =arr[i]-1;  // here correct is index of the element which can be present on the deserving index
            if(element!=arr[correctIndex]){        // if the element is not present on the correct index on which they have to be then we swap the element to the element which is present on that deserving index
                swap(arr,i,arr[i]-1);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first,int second){
        int temp =arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }
}
//tips : we use cyclic sort when the range is give like 1 to N or [0,N] or having to find in time complexity of bigO(n)
//tips : if the range is form 0 to N then every element will be at index = value
//tips : if the range is form 1 to N then every element will be at index = value-1
