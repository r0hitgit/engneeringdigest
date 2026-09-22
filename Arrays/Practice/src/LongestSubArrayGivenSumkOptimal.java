import java.util.ArrayList;

public class LongestSubArrayGivenSumkOptimal {
    static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,3,3};
        int k =6;
        int ans =longestOptimal(arr,k);
        System.out.println(ans);
    }
    static int longestOptimal(int [] arr, int k){

        int left =0 ,right =0;
        long sum = arr[0];
        int maxLen =0;
        int n = arr.length;
        while(right<n){
            while(left<=right && sum>k){
                sum -= arr[left];
                left++;
            }
            if(sum==k){
                maxLen = Math.max(maxLen,right -left+1);
            }
            right++;
            if(right<n) sum += arr[right];
        }
        return maxLen;

    }
}
