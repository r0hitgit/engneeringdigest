import org.w3c.dom.ls.LSOutput;

import java.util.*;
/*public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int result = 1;
        for(int i = 1; i <=n; i++){
            result = result*i;

        }
        System.out.println(result);
    }
}*/
public class factorial{
    static int result(int n,int result){
        for(int i = 1; i<=n;i++){
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num: ");
        int result = 1;
        int n =sc.nextInt();
        System.out.println("factorial of entered num "+result(n,result));
    }
}



