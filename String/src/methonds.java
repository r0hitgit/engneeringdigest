import java.util.Arrays;

public class methonds {
    static void main(String[] args) {
        String name ="Rohit Verma";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("    Rohit   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
