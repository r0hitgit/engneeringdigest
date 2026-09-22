
//Insert last element into its correct position in a sorted array
import java.util.Arrays;
public class InsertOneElement {
    static void main(String[] args) {
        int[] arr={1, 2, 4, 5, 3};
        InsertLastAtRight(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void InsertLastAtRight(int[] arr){
        int key =arr[arr.length-1]; // last element
        int j;
        for(j =arr.length-2;j>=0;j--){    // j will be the index of 5 and then we move left while checking it
            if(arr[j]>arr[j+1]){
                arr[j+1]=arr[j];  // shift the element
            }else{
                break;
            }
        }
        arr[j+1]=key;  //insert the key at right position
    }

}
