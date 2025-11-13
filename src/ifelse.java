import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int salary = in.nextInt();
        if(salary >10000){
            salary += 2000;
        }else{
            salary +=1000;
        }
        System.out.println(salary);
    }
}
