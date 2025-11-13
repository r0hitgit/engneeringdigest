//import java.util.Scanner;

public class countrepnum {
    public static void main(String[] args) {
        //Scanner in  = new Scanner(System,in);
        //System.out.println("Enter the number");
        //int n = in.nextInt();
        int n = 13234;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == 3){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);


    }
}
