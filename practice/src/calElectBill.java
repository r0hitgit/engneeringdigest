import java.util.Scanner;

public class calElectBill {
    public static void main(String[] args) {
        System.out.println("Enter the Current meter Reading");
        System.out.println("Enter the Previous meter Reading");
        Scanner sc = new Scanner(System.in);
        int curr= sc.nextInt();
        int prev = sc.nextInt();
        // unit consumed = a-b
        // 1 unit = 1kwh
        //Electricity is  measured in kwh
        if(curr<prev){
            System.out.println("Invalid Reading");
        }else {
            int unit = curr -prev;
            int ratePerUnit = 9;
            double bill = unit*ratePerUnit;  // as 9 rupee per unit
            System.out.println("total electric bill" + bill);
        }
    }
}
