import java.util.Scanner;

public class Bai41 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += a[i];
			}
			System.out.println(sum);
		}
	}
}