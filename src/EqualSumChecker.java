public class EqualSumChecker {
    public static boolean hasEqualSum(int firstAddedValue, int secondAddedValue, int solution) {
        if (firstAddedValue + secondAddedValue == solution) {
            return true;
        } else {
            return false;
        }
    }
}
