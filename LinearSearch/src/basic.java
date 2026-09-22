public class basic {
    public static void main(String[] args) {
        int[] arr ={23,45,1,2,8,19,-3,16,-11,28 };
        int target = 19;
        int ans = linearSearch(arr,target);
        boolean ans1 =linearSearch2(arr,target);
        System.out.println(ans);
        System.out.println(ans1);
    }
    //search in the array return the index if item is found
    //otherwise if item not found return -1;
    static int linearSearch(int[] arr,int target){
        if(arr.length ==0){
            return-1;
        }
        //run the loop
        for(int index =0;index<arr.length-1;index++){
            //check the element at every index if it is = target return its index
            int element =arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if none of the above return statement above have executed
        //hence the target is not found
        return -1;
    }
    // if we want to return the element instead of the index
    static boolean linearSearch2(int[] arr,int target){
        if(arr.length ==0){
            return false;
        }
        //run the loop
        //we can use for each loop here
        //check the element at every index if it is = target
        for(int element :arr) {
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the above return statement above have executed
        //hence the target is not found
        //as we are returning the element so may be -1 element is there in the arr so here we are returning true or false
        return false;
    }
}
