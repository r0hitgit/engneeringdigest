//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class hcflcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while(b!=0){
            int remender = a % b;
            a=b;
            b=remender;
        }
        int hcf = a;
        int lcm = (num1*num2)/hcf;

        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);


    }
}
