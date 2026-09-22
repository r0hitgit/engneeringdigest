import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] nums ={5,3,4,1,2};
        InsertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void InsertionSort(int[] nums){
        //at each pass array will be sorted till that index which is like at pass 1 when i=0 array sort till index 1 similarly further
        for(int i =0;i<nums.length-1;i++){     // here i<=nums.length-2 is same as i<nums.length-1
            for(int j =i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] nums,int first,int second){
        int temp =nums[first];
        nums[first]=nums[second];
        nums[second] =temp;

    }
}
