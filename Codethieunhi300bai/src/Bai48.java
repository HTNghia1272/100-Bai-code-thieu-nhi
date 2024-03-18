import java.util.Scanner;

public class Bai48 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int sum = 0;
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] % 5 == 0) {
					count++;
					sum += a[i];
				}
			}
			if (count >= 1) {
				for (int i = 0; i < n; i++) {
					if (a[i] % 5 == 0) {
						System.out.print(a[i] + " ");
					}
				}
			} else {
				System.out.println("-");
			}
			System.out.println();
			System.out.println(sum);
		}
	}
}