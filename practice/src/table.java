//Take a number as input and print the multiplication table for it.

import java.util.Scanner;


public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int multiple = i*num;
            System.out.println(num+ " X " +i+ " = " +multiple);

        }


    }
}
