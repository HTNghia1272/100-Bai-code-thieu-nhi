import java.util.Scanner;

public class Bai47 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int countNeg = 0;
			int countPos = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] > 0) {
					countPos++;
				}
				if (a[i] < 0) {
					countNeg++;
				}
			}
			System.out.println(countPos + " " + countNeg);
			if (countPos > 0) {
				for (int i = 0; i < n; i++) {
					if (a[i] > 0) {
						System.out.print(a[i] + " ");
					}
				}
			} else
				System.out.println("-");
			System.out.println();
			if (countNeg > 0) {
				for (int i = 0; i < n; i++) {
					if (a[i] < 0) {
						System.out.print(a[i] + " ");
					}
				}
			} else
				System.out.println("-");

		}
	}
}