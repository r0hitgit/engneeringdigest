
import java.util.Scanner;
public class stdin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();


        double num = scanner.nextDouble();
        scanner.nextLine();
        var name = scanner.nextLine();

        System.out.println("String : " +name);
        System.out.println("Double : " +num);
        System.out.println("int : " +i);
    }
}
