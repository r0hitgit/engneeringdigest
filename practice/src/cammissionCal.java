import java.util.Scanner;

public class cammissionCal {
    static double commissionCall(double serivceAmt,double commisionP){

        return serivceAmt * commisionP/100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double serivceAmt = sc.nextDouble();
        double commisionP = sc.nextDouble();
        double totalCommissionAmt = commissionCall(serivceAmt,commisionP);
        System.out.println(totalCommissionAmt);

    }
}
