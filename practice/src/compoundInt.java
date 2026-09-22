//Compound Int java Program
import java.util.Scanner;

public class compoundInt {

    static double calculateAmount(double principal, double rate, int time, int compoundsPerYear) {

        double amount = principal;
        double ratePerPeriod = rate / (100 * compoundsPerYear);
        int totalPeriods = compoundsPerYear * time;

        for (int i = 0; i < totalPeriods; i++) {
            amount = amount * (1 + ratePerPeriod);
        }

        return amount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal:");
        double principal = sc.nextDouble();

        System.out.println("Enter Rate (%):");
        double rate = sc.nextDouble();

        System.out.println("Enter Time (years):");
        int time = sc.nextInt();

        System.out.println("Enter Compounds per year:");
        int n = sc.nextInt();

        double amount = calculateAmount(principal, rate, time, n);
        double compoundInterest = amount - principal;

        System.out.println("Final Amount: " + amount);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
