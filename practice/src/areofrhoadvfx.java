public class areofrhoadvfx {
    static double area (double a,double angleDeg){
        // a =  side of rhombus
        return Math.pow(a,2)*Math.sin(Math.toRadians(angleDeg));   // area = a^2sin(theta) theta is angle b/w side
    }
    static void main(String[] args) {

        System.out.println("area: "+area(10,60));
    }
}
