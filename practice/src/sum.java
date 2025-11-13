//Take two numbers and print the sum of both.

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();
        int n = num1 + num2;
        System.out.println("Sum of both number is " +n);

        sc.close();
    }


}
