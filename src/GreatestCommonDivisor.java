public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int commonDivisor = 0;

        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                for (int j = 1; j <= second; j++) {
                    if (second % j == 0) {
                        if (i == j) {
                            commonDivisor = i;
                        }
                    }
                }
            }
        }
        return commonDivisor;
    }
}
