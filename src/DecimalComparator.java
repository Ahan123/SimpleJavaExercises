public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        firstValue *= 1000;
        secondValue *= 1000;

        if ((int) firstValue == (int) secondValue) {
            return true;
        } else {
            return false;
        }
    }
}
