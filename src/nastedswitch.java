import java.sql.SQLOutput;
import java.util.Scanner;
public class nastedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("kunal");
                break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Mangment Department");
                        break;
                    default:
                        System.out.println("No department Entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

    }
}
