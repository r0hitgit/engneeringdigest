import java.util.Scanner;

public class areaofparallelogram {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the length of height");
        double a = sc.nextDouble();
        System.out.println("Enter the length of base");
        double b = sc.nextDouble();


        double area = b*a;
        System.out.println("following area"+area);
    }
}
