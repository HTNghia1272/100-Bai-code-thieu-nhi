import java.util.Scanner;

public class Bai39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (isPerfectSquare(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    static boolean isPerfectSquare(int n) {
        if (n < 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}