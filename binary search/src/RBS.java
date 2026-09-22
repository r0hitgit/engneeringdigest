
// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class RBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
        System.out.println(findPivotWithDuplicates(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        // 3 cases
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {  // target is > start then the target always lies left side of pivot cuz all the number is smaller than start therefore the target is also not at the right side so we search in left side
            return binarySearch(nums, target, 0, pivot - 1);
        }else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);   // target <= start then target always lies right side of pivot cuz at left side all the element will be greater than start therefore start is also not be ther so we seacrh in right part
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }
        return -1;
    }

    // this will not work in duplicate values
    // pivot is the largest element on the rotated arr
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {    // here we are doing mid<end because if mid> end then it will give index out of bound error and && operator we are using because if then mid<end will be false then another part will not be executable
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {   // here we are doing mid> start so it don't give index out of bound error
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;        // as we are finding the largest element in the arr which is our pivot all the left part element is less than right part (right part means right side of an arr and left part is left side of an arr) and we are doing end =mid-1 for ignoring left part for finding largest element we have to search in right part
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
            //used in when there are duplicate arr
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
