public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10000001));
    }

    public static boolean isPalindrome(int x) {
        String origNum = Integer.toString(x);
        String revNum = "0";
        int digit = 0;

        if (x < 0) {
            return false;
        } if (x == 0 || x < 10) {
            return true;
        }

        while (x > 0) {
            digit = x % 10;
            revNum+=digit;
            x/=10;
        }
        return origNum.equals(revNum);
    }
}
