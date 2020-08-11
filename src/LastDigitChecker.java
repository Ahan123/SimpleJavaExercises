public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            return false;
        }

        firstNumber %= 10;
        secondNumber %= 10;
        thirdNumber %= 10;

        if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int value) {
        if (value < 10 || value > 1000) {
            return false;
        }
        return true;
    }
}
