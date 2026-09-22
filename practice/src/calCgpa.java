import java.util.Scanner;

public class calCgpa {
    static double cgCal(double Csum,double GCsum){
        //CGPA = (Sum of (Grade Point × Credit)) / (Sum of Credits)\
        if(Csum==0) {
            return 0;
        }
        return GCsum/Csum;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Number Of Sub");
        int n = sc.nextInt();
        //int i = 0;
        double Csum = 0;
        double GCsum = 0;

        for(int i =1;i<=n;i++) {
            System.out.println("Enter Grades");
            double grade = sc.nextDouble();
            System.out.println("Enter Credit");

            double credit = sc.nextDouble();
            Csum = Csum + credit;
            GCsum = GCsum + grade * credit;
        }
        double cgpa = cgCal(Csum, GCsum);
        System.out.println("Required cgpa:" +cgpa);
    }
}
