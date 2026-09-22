//if we have both adjcent side not an height

import java.util.Scanner;

public class areaofparalladv {
    static double area(double base,double side,double angleDeg){
        double angleRad = Math.toRadians(angleDeg);   //conversion degree to radian

        return base*side*Math.sin(angleRad);      //area = base * side (sin(theta)   theta angle between base and side
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base= sc.nextDouble();
        System.out.print("Enter side: ");
        double side= sc.nextDouble();
        System.out.print("Enter angle: ");
        double angle= sc.nextDouble();

        System.out.println("area: "+area(base, side, angle));

    }
}
