import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while(counter<10) {

            boolean checker = scanner.hasNextInt();
                if (checker == false) {
                    System.out.println("Invalid Number");
                }
        }
    }
}
