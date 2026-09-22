public class areaofrhombusfx {
    static double area(double p,double q){
        return (p*q)/2;
    }

    static void main(String[] args) {
        // p and q are digoanl of rhombus
        double p = 10;
        double q = 10;
        System.out.println("area: "+area(p,q));
    }
}
