public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit;

        if (number < 10) {
            lastDigit = number;
        } else {
            lastDigit = number % 10;
        }

        while (number > 0) {
            if ( number < 10) {
                firstDigit = number;
                break;
            }

            number /= 10;
            firstDigit = number % 10;
        }
        return firstDigit + lastDigit;
    }
}
