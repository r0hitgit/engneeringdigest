//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter n ");
        int n = sc.nextInt();
        int a= 0;
        int b = 1;
        //System.out.println(a+" "+b+" ");

        for (int i = 2; i < n; i++) {
            int next = a+b;
            System.out.print(next+ " ");
            a = b;
            b = next;

        }

    }


}


