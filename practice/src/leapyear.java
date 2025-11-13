//Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int num = sc.nextInt();
        if ( (num % 4 == 0 && num % 100 !=0) || (num % 400== 0)) {
            System.out.println("Leap year");


        }else{
            System.out.println("Not leap year");
        }
    }
}
