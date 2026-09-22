import java.util.Arrays;

//Sort strings by length but maintain order for same length
public class sortStringByLen {
    static void main(String[] args) {
        String[] arr ={"a", "abc", "ab", "de"};
        SortStringByLen(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SortStringByLen(String[] arr){
        for(int i =1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j].length()<arr[j-1].length()){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(String[] arr,int first,int second){
        String temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }
}
