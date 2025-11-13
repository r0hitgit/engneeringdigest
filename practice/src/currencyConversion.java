package currencyConversion;

//Input currency in rupees and output in USD.
import java.util.Scanner;
public class currencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Amt");
        double num = sc.nextDouble();

        double n = num/84;
        System.out.println("dollar:" +n);


    }
}

//learning we use double insted of using int whern we want value in unlimited length og decimal
