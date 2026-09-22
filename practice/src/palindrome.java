//To find out whether the given String is Palindrome or not.
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String a = sc.next();   // use for reading the starting word only
        String reverse = "";    // don't give space in "".........because " " is not empty
        int n = a.length();
        for (int i = n-1; i >=0; i--) {   //a.length give length but last index is n-1 as indexing start with zero and if we don't do n-1 it give out of bound error
            reverse = reverse + a.charAt(i);
        }                            // reverse += "" this is wrong for appending string we use nameofstring.charAt(indexnumber)

        if(reverse.equals(a)){
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }


    }

