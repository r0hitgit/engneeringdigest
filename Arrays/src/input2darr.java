import java.util.Arrays;
import java.util.Scanner;

public class input2darr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length); //no. of rows

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }

        }
        // output
    //    for (int row = 0; row < arr.length; row++) {          // normal way to .......but we use enhanced for loop which is shown below
    //        for (int col = 0; col < arr[row].length; col++) {  // we use this for printing
    //           System.out.print(arr[row][col] + " ");
    //        }
    //        System.out.println();
    //        System.out.println(Arrays.toString(arr[row]));           // efficient method for printing (internally same thing is working as above shown
    //    }
        //output using enhance for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
