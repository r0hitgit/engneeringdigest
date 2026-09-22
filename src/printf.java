import java.util.Scanner;

public class printf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data store karne ke liye arrays banaye
        String[] languages = new String[3];
        int[] scores = new int[3];

        System.out.println("Ek-ek karke 3 inputs enter karein (Jaise: java 100):");

        // Step 1: Is loop mein computer sirf aapse INPUT lega, kuch bhi print nahi karega
        for (int i = 0; i < 3; i++) {
            languages[i] = sc.next();
            scores[i] = sc.nextInt();
        }

        System.out.println("\n--- OUTPUT ZONE ---");
        System.out.println("=====================");

        // Step 2: Jab aap saara input de chuke hain, ab ek sath saaf-suthra print hoga
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", languages[i], scores[i]);
        }

        System.out.println("=====================");
        sc.close();
    }
}

// %-15s -> String left-aligned with 15 spaces width
// %03d  -> Integer padded with leading zeros to make it 3 digits
// %n    -> New line character