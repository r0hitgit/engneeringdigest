public class areaofequilateral {
    static double area(double side){
    // area = root(3)/4 * side^2
        return (Math.sqrt(3)/4)*Math.pow(side,2);
    }
    public static void main(String[] args) {
        System.out.println("area: "+area(10));

    }
}
