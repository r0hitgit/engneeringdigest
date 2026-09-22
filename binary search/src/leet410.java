public class leet410 {
    static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        int ans = splitArray(nums, k);
        System.out.println(ans);


    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]); // in the end of the loop this will contain the max item for the arr
            end +=nums[i];
        }
        //binary search
        while(start<end){
            //try for the middle as potential ans
            int mid = start+(end-start)/2;
             //calculate how many pieces we can divide this as maximum sum
            int sum =0;
            int pieces = 1;   //initially we can divide it in one piece
            for(int num:nums) {
                if (sum + num > mid) {
                    //you can not add this in this subarray we have to make new one
                    //say you add this num in new subarray sum=num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if(pieces>k){
                start = mid+1;
            }else{
                end = mid;
            }

        }



        return end;   // here start == end
        }

    }


