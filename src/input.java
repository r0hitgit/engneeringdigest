import java.sql.SQLOutput;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print(" ");
        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.println("Wierd");
        } else if (n % 2 == 0) {
            if (n>=2 && n<=5) {
                System.out.println("Not Wierd");
            }

            else if(n>=6 && n<=20) {
                System.out.println("Wierd");
            }
            else if (n>20){
                System.out.println("Not Wierd");

            }
        }
    }
}




