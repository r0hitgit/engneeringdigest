import java.util.Scanner;

public class avgOfDigit {

    public static void main(String[] args) {
            System.out.println("Enter a number:");
            Scanner sc = new Scanner(System.in);

            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                int count = 0;
                int sum = 0;

                // We save a copy of 'n' because the loop will destroy the original value
                int originalNum = n;

                while (n > 0) {
                    int lastDigit = n % 10; // 1. Grab the last digit FIRST (e.g., 3)
                    sum = sum + lastDigit;  // 2. Add it to the sum
                    count++;                // 3. Count the digit
                    n = n / 10;             // 4. Chop off the last digit for the next turn
                }

                // Calculate actual average (cast to double so we don't lose decimals)
                double avg = (double) sum / count;

                System.out.println("Average of digits in " + originalNum + " is: " + avg);
            }
            sc.close();
        }
    }
