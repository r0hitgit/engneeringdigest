//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int a= 0;
        int b = 1;

        for (int i = 0; i < n; i++) {       // if we take i = 0 and i<=n it prints more numbers of terms then required
            int c = a+b;
            System.out.print(a+ " ");
            a = b;
            b = c;

        }

    }
}

/* things to memories
        a=0  <initialization>
        b=1
        print a
        c = a+b  calculate next term

        a=b <shifting>
        b=c

 */
