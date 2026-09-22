public class lc485 {
    static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,1,1,1,1};
        int ans =findMaxOne(arr);
        System.out.println(ans);
    }
    static int findMaxOne(int[] arr){
        int maxi=0;
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
               // when we find count is greater than maxi then we update maxi
                /*if(count>maxi ) {
                    maxi = count;
                }*/
                maxi =Math.max(maxi,count);
            }else{
                count=0;
            }
        }
        return maxi;
    }
}
