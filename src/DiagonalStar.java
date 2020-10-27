public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int y = 1; y <= number; y++) {
            for (int x = 1; x <= number; x++) {
                if (x == 1 || x == number) {
                    System.out.print("*");
                } else if (y == 1 || y == number) {
                    System.out.print("*");
                } else if (x == y) {
                    System.out.print("*");
                } else if (y == number - x + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (x == number) {
                    System.out.println();
                }
            }
        }
    }
}