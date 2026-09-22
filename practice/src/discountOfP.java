//Calculate the Discount of the product
import java.util.Scanner;

public class discountOfP {
    static double discountCal(double prize , double discountPercent){
        if(prize < 0 || discountPercent<0){
            return -1;
        }else{
            return prize * (1-discountPercent/100);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prize = sc.nextInt();
        double discountPercent = sc.nextInt();
        double finalPrize = discountCal(prize,discountPercent);
        if(finalPrize<0){
            System.out.println("Invalid Input");
        }else{

            System.out.println(finalPrize);
        }


    }
}
