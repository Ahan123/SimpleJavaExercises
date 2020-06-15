import java.util.Scanner;

public class SpeedConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = collectData();
        printConversion(value);
    }

    public static int collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the the kilometers per hour you would to convert to miles per hour: ");
        int value = sc.nextInt();
        return value;
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return (long) Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            int milesPerHour = (int) toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
















