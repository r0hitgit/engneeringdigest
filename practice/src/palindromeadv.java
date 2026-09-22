//To find out whether the given String is Palindrome or not.
import java.util.*;
public class palindromeadv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String a = sc.next();

        StringBuilder reverse =  new StringBuilder();// don't give space in "".........because " " is not empty
        //String ans = reverse.reverse().toString();
        int n = a.length();
        for (int i = n - 1; i >=0; i--) {   //a.length give length but last index is n-1
            reverse.append(a.charAt(i));
        }                           // reverse += "" this is wrong for appending string we use name of string.charAt(indexnumber)
        //System.out.println(ans);
        if(reverse.toString().equals(a)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }


}

