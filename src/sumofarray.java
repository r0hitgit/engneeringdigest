public class sumofarray {
    public static void main(String[] args){
        int[] arr = {-2 ,4 ,55 ,-4 ,11 ,-55 ,11 ,2 };
        //int sum = arr[0]+arr[1]+arr[2]+arr[3]......... we can add like this but we use loop
        int sum= 0; // result
        /*for (int i = 0; i <arr.length ; i++) {
            sum += arr[i]; //sum = sum+arr[i] ye bhi likh skte hai

        }*/
        //we can use for is also
        for(int i : arr){
            sum +=i;

        }
        System.out.println(sum);
    }
}
