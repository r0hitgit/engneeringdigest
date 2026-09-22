import java.util.Arrays;

// two pointer approch
public class twoSumm {
    static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        System.out.println(twoSum(arr,14));
    }
    static String twoSum(int[] arr,int target){
        Arrays.sort(arr);
        int left =0;
        int right = arr.length-1;

        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum== target){
                return "yes";
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return "no";
    }
}
