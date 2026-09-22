//find the index of ceiling value of target element
public class findCeiling {
    static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target= 15;
        int ans = findCeling(arr,target);
        System.out.println(ans);
    }
    // return the index of smallest num >= target element
    static int findCeling(int[]arr,int target){

        // but what if the target element is greater than the greatest element in the array than there is no ceiling element
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target == arr[mid]){
                return mid;

            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                start =mid+1;
            }
        }
        return start;
    }
}
