import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int turnCounter = 0;
        int sum = 0;

        while(turnCounter<10) {
            System.out.println("Please type in the " + (turnCounter+1) + "st number.");
            boolean checker = scanner.hasNextInt();
                if (checker) {
                    int userInput = scanner.nextInt();
                    sum+=userInput;
                    turnCounter++;

                } else {
                    System.out.println("Invalid Number");
                }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The total sum is " + sum);
    }
}
