import java.util.Scanner;

//
public class leet1281 {
    static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int n = 234;
        int temp = n;
        int sum = 0;
        int product = 1;

        while(temp>0){
            int digit = temp%10;

            sum = sum + digit;
            product = product* digit;




            temp= temp/10;


        }
        System.out.println(product-sum);
    }
}
