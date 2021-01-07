public class ReverseNumber {

    public static void main(String[] args) {
        int blah = reverse(-73534);
    }

    public static int reverse(int x) {

        String number = "";

        if (x == 0) {
            return 0;
        }

        if (x < 0) {
            x *= -1;
            number+="-";
            if (x < 0) {
                return 0;
            }
        }
        while (x > 0) {
            int digit = x % 10;
            number += digit;
            x /= 10;
        }

        if (Double.parseDouble(number) > (double) Integer.MAX_VALUE || Double.parseDouble(number) < (double) Integer.MIN_VALUE) {
            return 0;
        }
        return Integer.parseInt(number);
    }
}
