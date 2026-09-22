
// Hacker Rank : print the series of the number a+2^0*b, a+2^1*b, a+2^2*b,a+2^3*b
import java.util.Scanner;
public class series {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter test case: ");
        // test case mtlb program kitte bar run karna hai
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            int power = 1;

            for (int j = 0; j < n; j++) {
                sum = sum + (power * b);
                System.out.print(sum + " ");
                power = power * 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
