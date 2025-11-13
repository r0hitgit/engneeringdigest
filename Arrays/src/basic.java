import java.util.Arrays;

public class  basic {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]= 23;
        arr[1]= 2;
        arr[2]= 45;
        arr[3]= 63;
        arr[4]= 58;



        System.out.println(arr[4]); //For printing one particular element

        System.out.println(Arrays.toString(arr)); // use for printing whole array , for using this we have to import arrays class

        for(int i = 0;i<arr.length;i++) { // this is also we use for printing an whole array
            System.out.print(arr[i] + " ");
        }


    }
}
