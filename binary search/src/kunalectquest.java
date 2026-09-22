public class kunalectquest {
    public static void main(String[] args) {
        int [] arr = {-18,-12,-4,-0,2,3,4,15,16,18,22,45,89};    // remeber sorted arr
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);            // answer will be 10 it will return its index

    }

    static int binarySearch(int [] arr , int target){

        int start = 0;
        int end = arr.length-1;

        //return index of target element
        while(start<= end){
            // find the middle element
//            int mid = (start+end)/2; (might be possible that (start+end) exceed the range of integer in java in that case we can get so erro for more info check notes.
            int mid = start+(end-start)/2;     // same (start+end)/2 is written in diff format

            if(target < arr[mid]){  // we get target in left side therefor end get change new end is mid-1 and start will be same
                end = mid-1;
            }else if(target > arr[mid]){ // we get target in right side therefor start get change new start is mid+1 end will be same
                start = mid+1;
            }else{
                // target found
                return mid;              //(target == arr[mid]) element found       [here if return executed faction close]
            }
        }
        return -1;       // when element is not in the arr which is the condition when start>end "element does not exist" [execute when upper return will not run]

    }
}
