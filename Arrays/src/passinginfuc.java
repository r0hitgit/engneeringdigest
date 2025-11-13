import java.util.Arrays;

public class passinginfuc {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=99;                                        //by using function , pass by value
                                                   //arrays are mutable in java
    }
}
