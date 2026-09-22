import java.util.Scanner;

public class depriciationCal {
    static double depriCal(int n,int d ,double assets){
        int i = 0;

        while (i < n) {
            assets = assets * (1 - d / 100.0);
            i++;
        }

        return assets;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("year");
        int n = sc.nextInt();

        System.out.println("depriciation percentage");
        int d = sc.nextInt();

        double assets = 10000;

        double deprication = depriCal(n,d,assets);

        System.out.println(deprication);
    }
}

