import java.util.Arrays;
import java.util.HashMap;

public class LongestSubArrayGivenSumkBetter {
    static void main(String[] args) {
        int[] arr ={1,2,3,1,1,1,1,4,2,3};
        int ans =longestSubarray(arr,4);
        System.out.println(ans);


    }
    static int longestSubarray(int[] arr, int k) {

        HashMap<Long, Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            // Calculate prefix sum
            sum += arr[i];
            // Case 1: Subarray starts from index 0
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            // Remaining sum
            long rem = sum - k;

            // Check if remaining sum exists in hashmap
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Store prefix sum only if it doesn't already exist
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
}
