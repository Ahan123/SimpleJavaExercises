import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long avg = 0;
        int count = 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean checker = scanner.hasNextInt();
            if (checker) {
                int input = scanner.nextInt();
                sum += input;
                double doubleAvg = (double) sum/count;
                avg = Math.round(doubleAvg);
                count++;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }
    }
}
