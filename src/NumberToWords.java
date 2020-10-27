public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digitCount = getDigitCount(number);
            number = reverse(number);
            int savedNumber = number;
            int digit = 1;
            String word = "";
            int count = 0;
            while (count < digitCount) {
                digit = number % 10;
                if (savedNumber != number) {
                    word += " ";
                }
                if (digit == 0) {
                    word += "Zero";
                } else if (digit == 1) {
                    word += "One";
                } else if (digit == 2) {
                    word += "Two";
                } else if (digit == 3) {
                    word += "Three";
                } else if (digit == 4) {
                    word += "Four";
                } else if (digit == 5) {
                    word += "Five";
                } else if (digit == 6) {
                    word += "Six";
                } else if (digit == 7) {
                    word += "Seven";
                } else if (digit == 8) {
                    word += "Eight";
                } else if (digit == 9) {
                    word += "Nine";
                }
                number /= 10;
                count++;
            }
            System.out.println(word);
        }
    }

    public static int reverse(int number) {
        String stringedNumber = "";
        int digit;
        if (number < 0) {
            stringedNumber += "-";
            number *= -1;
        }
        if (number == 0) {
            stringedNumber = "0";
        }
        while (number > 0) {
            digit = number % 10;
            stringedNumber += Integer.toString(digit);
            number /= 10;
        }
        return Integer.parseInt(stringedNumber);
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } if (number < 10) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
