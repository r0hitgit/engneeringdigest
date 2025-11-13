//To find out whether the given String is Palindrome or not.
import java.util.*;
public class palindromeadv {
    public static void main(String[] args) {
        String a = "rohit";
        StringBuilder reverse =  new StringBuilder();    // don't give space in "".........because " " is not empty
        int n = a.length();
        for (int i = n - 1; i >=0; i--) {   //a.length give length but last index is n-1
            reverse.append(a.charAt(i));
        }                            // reverse += "" this is wrong for appending string we use nameofstring.charAt(indexnumber)

        if(reverse.equals(a)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }


}

