import java.util.Scanner;

public class Bai90 {

    static int calculateFx(int k, double x, double[] a, int[] n) {
        int result = 0;

        for (int i = 0; i < k; i++) {
            result += a[i] * Math.pow(x, n[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        double x = scanner.nextDouble();

        double[] a = new double[k];
        int[] n = new int[k];

        for (int i = 0; i < k; i++) {
            a[i] = scanner.nextDouble();
            n[i] = scanner.nextInt();
        }

        int result = calculateFx(k, x, a, n);

        System.out.println(result);

        scanner.close();
    }
}