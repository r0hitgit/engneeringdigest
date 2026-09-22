import java.util.Arrays;

public class insertionSort {
    static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void InsertionSort(int[] arr){
        //at every pass the element get sorted till the index corresponding to its number of pass
        for(int i =0;i<arr.length-1;i++){
            //j will start form i+1 and move to left side while checking its previous element is lesser than swap if not then break
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;    // because arr will already sorted if arr[j]>arr[j-1]
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
