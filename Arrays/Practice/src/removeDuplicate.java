//Remove Duplicates
import java.util.Arrays;
public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int k = numOfDuplicate(arr);
        System.out.println(k);
        System.out.println(Arrays.toString(arr));
    }
    static int numOfDuplicate(int[] arr) {
        int i = 0;
        for (int j = 1; j <= arr.length - 1; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
