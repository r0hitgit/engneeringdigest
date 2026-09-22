//keep taking number as an input till the user enter 'x' , after that print sum of all
import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int sum = 0;

        while(true){
            String input = sc.next();

            if(input.equals("x")){
                break;
            }
            int num = Integer.parseInt(input);  //conversion of string in int
            sum += num;

        }
        System.out.println("sum: " +sum);
    }
}

