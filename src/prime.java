//find prime number of the given number
import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number: ");
        //koi bhi number 1 se chota ya 1 khud prime number nhi hot hai
        if(n<=1){
            System.out.println("Not a prime number");
        }
        //man lete hai given number prime hai
        boolean isPrime=true;
        // 2 se issliye start kr rhe hai kyu ki 1 se toh sare number divide hojate hai and i*i <=n issliye kiye hai kyu ki uske bad factors repeat hone lgte hai to number jo hoga vo apne root se paihle hi kisi number se divide hojayega
        for(int i =2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime number");
        }
        sc.close();
    }
}

