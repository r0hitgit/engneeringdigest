public class findMax {
    public static void main(String[] args) {
        int[] arr ={18,12,-7,3,14,28};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans =arr[0];
        int max =Integer.MIN_VALUE;   // we can use this also
        for(int i =0;i<=arr.length-1;i++){
            int element =arr[i];

            if(element>ans){
                ans =arr[i];
            }
        }
        return ans;
    }
}
