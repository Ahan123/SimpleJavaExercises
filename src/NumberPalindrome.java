public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        String n = "";

        if (number < 0) {
            number *= -1;
        }

        int originalNumber = number;

        while (number > 0) {
            n += Integer.toString(number % 10);
            number /= 10;
        }

        if (originalNumber == Integer.parseInt(n)) {
            return true;
        }
        return false;
    }
}
