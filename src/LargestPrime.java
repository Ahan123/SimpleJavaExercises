public class LargestPrime {

    public static int getLargestPrime(int number) {
        int gpf = 0;
        if (number <= 1) {
            return -1;
        }


        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                if (number == i) {
                    break;
                }
                number /= i;
            }
        }
        return number;
    }
}
