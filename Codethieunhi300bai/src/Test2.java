import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n;
		do {
			System.out.println("Nhap so tien n:");
			n = sc.nextLong();
		} while (n % 1000 != 0 || n <= 0);

		int[] A = { 500000, 200000, 100000, 50000, 20000, 10000 };
		int i = 0;
		while (n > 0) {
			if (n >= A[i]) {
				System.out.println("Co " + n / A[i] + " to tien " + A[i]);
				n = n % A[i];
			}
			i++;
		}

	}
}
