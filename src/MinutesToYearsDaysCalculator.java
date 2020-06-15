public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0L) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600L;
            long days = (minutes % 525600L) / 1440L;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
