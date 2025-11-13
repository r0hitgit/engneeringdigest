import java.util.Arrays;
import java.util.Scanner;

public class stringinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = in.nextInt();
        String[] str1 = new String[n];
        System.out.print("Enter Element: " );
        for(int i=0 ;i<str1.length ; i++){
            str1[i] =in.next();
        }
        System.out.println(Arrays.toString(str1));

        //modify
        str1[1]="rohit";
        System.out.println(Arrays.toString(str1));





    }
}
