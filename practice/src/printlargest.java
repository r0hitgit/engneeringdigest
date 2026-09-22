import java.util.Scanner;

public class printlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number (0 for stop): ");
        int largest = Integer.MIN_VALUE;

        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            if(n>largest){
                largest = n;
            }
        }
        if(largest == Integer.MIN_VALUE){
            System.out.println("No Number is entered");
        }else{
            System.out.println("Largest number is: "+largest);
        }
    }
}
