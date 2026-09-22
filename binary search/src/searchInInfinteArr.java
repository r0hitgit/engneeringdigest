//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/

public class searchInInfinteArr {
    static void main(String[] args) {
        int [] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    static int ans(int []arr,int target){
        //find the range
        //first we start with box of size two
        int start =0;
        int end = 1;
        //Condition when target lie in side the range
        while(target>arr[end]){
            int temp = end+1; // this is my new start
            //doubling the box value
            //end = previous end+sizeOfBox*2
            end =end+(end-start+1)*2;
            start = temp;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int [] arr, int target,int start,int end){

        while(start<end){
            int mid = start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
