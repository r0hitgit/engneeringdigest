import java.util.Arrays;
public class changevaluearr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0] = 99; //if you make a change to the object via this reference variable,same object will be change
    }
}
