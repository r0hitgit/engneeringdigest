import java.util.Scanner;

//public class distanceCal {
    /*static double distCal(double initial,double finall){

    }

    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        //point A
        System.out.println("Enter the X coo of point A");
        int xA = sc.nextInt();
        System.out.println("Enter the Y coo of point A");
        int yA = sc.nextInt();
        //pint B
        System.out.println("Enter the X coo of point B");
        int xB = sc.nextInt();
        System.out.println("Enter the Y coo of point B");
        int yB = sc.nextInt();

        double dist = Math.sqrt(Math.pow(xA-xB,2) + Math.pow(yA-yB,2));
        System.out.println("Distance bewtween point A and B" +dist);



    }*/
    public class distanceCal {

    static double distCal(double Xa, double Ya, double Xb, double Yb){
        double dx = Xa-Xb;
        double dy = Ya-Yb;

        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Xa = sc.nextDouble();
        double Ya = sc.nextDouble();
        double Xb = sc.nextDouble();
        double Yb = sc.nextDouble();
        double dist = distCal(Xa,Ya,Xb,Yb);

        System.out.println(dist);
    }
}
