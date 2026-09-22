import java.util.Arrays;

public class selection {
    static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        //find the max item in the remaining array and swap with last index
        for(int i =0;i<=arr.length-1;i++){
            //last Index
            int last =arr.length-i-1;
            int maxIndex =findMaxIndex(arr,0,last);

                //swaping the maxIndex item with lastIndex item
                swap(arr,maxIndex,last);

        }
    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second]=temp;
    }

    // finding the index of max element
    static int findMaxIndex(int[] arr,int start,int end){
        int max =arr[start];
            for(int i=start;i<end;i++){
            if(arr[i]>max){
                max=i;
            }
        }
        return max;
    }
}
