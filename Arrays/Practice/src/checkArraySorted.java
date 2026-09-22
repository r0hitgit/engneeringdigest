
public class checkArraySorted {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5,6};
        //boolean result = Check(arr);
        if (Check(arr)) {
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
    static boolean Check(int[] arr){
        for(int i =0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]) {
                    return false;
                }
        }
        return true;
    }
// if I want to do like when arr[i]<arr[i+1] loop will continue and when arr[i]>arr[i+1] then return false
    static boolean anotherMethodCheck(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] <= arr[i+1]){
                continue;                    // if we return true here then if then condition become true then it imidiatly return ture and loop will not execute further
            } else {
                return false;
            }
        }
        return true;
    }
}


/*learning: It immediately: Stops the current method
                            Exits the loop
                            Goes back to the caller
                            It does NOT continue the loop.
 return = "I am done. Exit this method right now."

It doesn’t matter if:

Loop is 100 times

There are more statements below

Nested loops exist
*/
