import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        while(true) {
            boolean checker = scanner.hasNextInt();
            if (checker) {
                int number = scanner.nextInt();
               if (number > maxNumber) {
                   maxNumber = number;
                } else if (number < minNumber) {
                   minNumber = number;
                }
            } else {
                System.out.println("You did not enter a valid number. Please try again.");
            }
            System.out.println("Max Num = " + maxNumber + " | Min Num = " + minNumber);
            scanner.nextLine();
        }
    }
}
