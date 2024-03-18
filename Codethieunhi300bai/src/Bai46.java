import java.util.Scanner;

public class Bai46 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			boolean found = false;
			int locate = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] == x) {
					found = true;
					locate = i;
					break;
				}
			}
			if (found) {
				System.out.println("Yes");
				System.out.println(locate);
			} else {
				System.out.println("No");
			}
		}
	}
}