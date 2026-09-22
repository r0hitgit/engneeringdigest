
import java.util.Scanner;
public class stdin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double num = sc.nextDouble();
        sc.nextLine();     // used for cleaning the next line so we can take input of the string in short for moving to new line
        var name = sc.nextLine();

        System.out.println("String : " +name);
        System.out.println("Double : " +num);
        System.out.println("int : " +i);
    }
}
