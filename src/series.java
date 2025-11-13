import java.util.Scanner;

public class series {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String finaloutput = " ";
        for(int i=1;i<=t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            int power = 1;
            String seriesLine = "";
            for(int j = 0 ; j<n; j++){
                sum = sum+power*b;
                System.out.print(sum+ " ");
                power = power*2;
            }
            finaloutput +=seriesLine.trim() +"\n";

        }
        System.out.println(finaloutput);
        sc.close();
    }
}
