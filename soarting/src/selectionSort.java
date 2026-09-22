import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] nums={3,1,5,4,2};
        selection(nums);
        System.out.println(Arrays.toString(nums));


    }
    static void selection(int[] nums){
        for(int i =0;i<nums.length;i++){
            //find the maximum element in the remaining array and swap it with correct index
            int last =nums.length-i-1;
            int maxIndex = getMaxIndex(nums,0,last);
            swap(nums,maxIndex,last);
        }
    }
    static void swap(int[] nums,int first,int second){
        int temp =nums[first];
        nums[first] = nums[second];
        nums[second] =temp;

    }
    static int getMaxIndex(int[] nums, int start,int end){
        int max = start;
        for(int i =start;i<=end;i++){
            if(nums[i]>nums[max]){
                max =i;
            }
        }
        return max;
    }
}
