public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        int firstDigitOfFirstNumber = firstNumber/10;
        int secondDigitOfFirstNumber = firstNumber % 10;
        int digit;

        while (secondNumber > 0) {
            digit = secondNumber % 10;
            if (digit == firstDigitOfFirstNumber || digit == secondDigitOfFirstNumber) {
                return true;
            }
            secondNumber /= 10;
        }
        return false;
    }
}
