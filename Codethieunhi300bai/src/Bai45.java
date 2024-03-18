import java.util.Scanner;

public class Bai45 {
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
				if (a[i] % 2 == 0) {
					sum += a[i];
					count++;
				}
			}
			if (count > 0) {
				System.out.println(sum);
			} else {
				System.out.println("-");
			}
		}
	}
}
