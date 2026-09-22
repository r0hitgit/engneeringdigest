import java.util.Scanner;

public class battingAvg{

    static double calculateBattingAverage(int totalRuns, int timesOut) {
        if (timesOut == 0) {
            return -1;
        }
        return (double) totalRuns / timesOut;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalRuns = sc.nextInt();
        int timesOut = sc.nextInt();

        double average = calculateBattingAverage(totalRuns, timesOut);

        if (average == -1) {
            System.out.println("Batting average is undefined (player never got out)");
        } else {
            System.out.println(average);
        }
    }
}

