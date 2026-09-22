//import java.util.Scanner;

public class countrepnum {
    public static void main(String[] args) {
        //Scanner in  = new Scanner(System,in);
        //System.out.println("Enter the number");
        //int n = in.nextInt();
        int n = 13234;
        int count = 0;
        while(n>0){
            int remender = n%10;
            if(remender == 3){
                count++;
            }
            // we can do this for removing the last digit
            n = n/10;
        }
        System.out.println(count);


    }
}
