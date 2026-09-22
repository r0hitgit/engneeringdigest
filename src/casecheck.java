import java.util.Scanner;
public class casecheck {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch>= 'a' && ch<='z'){
            System.out.println("Lower case");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("Upper Case");
        }else if(Character.isDigit(ch)){
            System.out.println("invalid it is numeric number");
        }else{
            System.out.println("invalid it is special charecter");
        }


    }
}
