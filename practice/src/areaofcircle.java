//area of circle
import java.util.Scanner;
public class areaofcircle {
    static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double r = sc.nextDouble();
        double area =  Math.PI * r * r; //learning is Math.PI
        System.out.println("the area of the following circle"+area);

    }

}
