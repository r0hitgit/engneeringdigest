import java.util.Arrays;

public class InsertionsortFirstKEle {
    static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        int k =5;
        FirstKEle(arr,5);
        System.out.println(Arrays.toString(arr));

    }
    static void FirstKEle(int[] arr ,int k){
        for(int i =1;i<k-1;i++){   // as i start with 1 as first element is already sorted if first element is not sorted it will sorted by inner for loop
            for(int j =i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }
}
