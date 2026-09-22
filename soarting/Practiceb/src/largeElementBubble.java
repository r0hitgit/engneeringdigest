//find the largest element using bubble sort
//Using one pass of Bubble Sort, move the largest element to the end of the array.
public class largeElementBubble {
    static void main(String[] args) {
        int [] nums ={0,9,10, 7,4, 2, 1, 3};
        int ans = findLargest(nums);
        System.out.println(ans);
    }
    static int findLargest(int[] nums) {
        // for only one pass
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] < nums[j - 1]) {
                swap(nums, j, j - 1);
            }

        }
        return nums[nums.length - 1];


    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }
}
