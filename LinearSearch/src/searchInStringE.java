//same as searchInString by using for each loop
import java.util.*;
public class searchInStringE {
    public static void main(String[] args) {
    String name ="rohit";
    char target ='h';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));  // this will print the whole string in the arr

    }

    static boolean search(String str,char target) {
        // same as str.length() == 0
        if (str.isEmpty()) {
        return false;
        }
        for(char ch :str.toCharArray()){
            return true;
        }
        return false;
    }
}
