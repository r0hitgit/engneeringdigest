import java.util.Scanner;

public class areaofisosceles {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length of equal side: ");
        double a = sc.nextDouble();
        System.out.print("enter the length of base: ");

        double b = sc.nextDouble();

        if(a>b/2) {          //condition of beaign of an trinagle

            double h = Math.sqrt(Math.pow(a, 2) - (Math.pow(b, 2)) / 4); //Math.sqrt use for sq root
            double area = 0.5 * b * h;
            System.out.println("following area of triangle"+area);
        }else{
            System.out.println("Invalid dimension");
        }

    }
}
