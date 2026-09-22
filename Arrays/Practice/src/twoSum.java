import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    static void main(String[] args) {
        int[] arr = {2,6,5,8,11};

        System.out.println(Arrays.toString(twoSum(arr,14)));
    }
    static int[] twoSum (int[] arr,int sum){
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i  =0;i<arr.length;i++){
            int num = arr[i];
            int moreNeeded = sum-num;
            if(map.containsKey(moreNeeded)){
                return new int[]{map.get(moreNeeded),i};
            }else{
                map.put(num,i);
            }
        }
        return new int[] {-1,-1};
    }
}
