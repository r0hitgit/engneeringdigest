import java.util.Arrays;

public class LongestSubArrGivenSumK {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        //int k =4;
        int ans = FindLongestSubArrHavingSumK(arr, 4);
        System.out.println(ans);
        int[] LongestSubarray= longestSubArray(arr, 4);
        System.out.println(Arrays.toString(LongestSubarray));
    }

    static int FindLongestSubArrHavingSumK(int[] arr, int k) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    //we have to find the length largest subarray having sum k
                    length = Math.max(length, j - i + 1);
                }
            }
        }
            return length;
    }
    //if we want to return that longest subarray
    static int[] longestSubArray(int[] arr,int k ){
        int longestLength =0;
        int start=-1;
        int end =-1;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum =sum+arr[j];
                //know we have to find the longest sub array then
                int currentLength =j-i+1;
                if(currentLength >longestLength){
                    longestLength =j-i+1;
                    start=i;
                    end=j;
                }
                // make new array for storing the element and returning subarray
            }
        }
        int[] result =new int[longestLength];
        for (int i = 0; i<longestLength; i++){
                result[i] =arr[start+i];
            }
        return result;
    }

}





//            for(int j=i;j<arr.length;j++){
//                int sum =0;
//                for(k=i;i<j;i++){
//                    sum =sum+arr[k];
//                    if(sum==k){
//                        length=Math.max(length,j-i+1);
//                    }
//                }
//            }
