import java.util.*;

public class bubbleSort {
    static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        bubble(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void bubble(int[] nums){
        //if the array is sorted
        boolean swapped;   // This variable checks whether any swap happened during the pass.
        //run the step n-1 times
        for(int i=0;i<nums.length;i++) {
            swapped = false;
            //for each step, max item will come at the last of respective index this is called passes and as the max value element comes at last so we don't have to compare therefore we egnore it and we take arr.length-i
            for (int j = 1; j < nums.length - i; j++) {
                //swap the item if the item is smaller than the previous item
                if (nums[j] < nums[j - 1]) {
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }

            //if it not swaped for the particular value of i that means array is sorted hence stop the program
            if (!swapped) {   // or we can also write swapped == false
                break;
            }
        }


    }
}
