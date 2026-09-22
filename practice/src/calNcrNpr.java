import java.util.Scanner;

public class calNcrNpr {
    static long factorial(int n){
        long fact = 1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r= sc.nextInt();

        long npr = factorial(n)/factorial(n-r);
        long ncr = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println("nPr "+npr);
        System.out.println("nCr "+ncr);
    }
}
