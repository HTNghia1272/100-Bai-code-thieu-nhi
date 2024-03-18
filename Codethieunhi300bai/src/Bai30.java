import java.util.Scanner;

public class Bai30 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int tong = 0;
			for (int i = m; i <= n; i++) {
				tong += i;
			}
			System.out.println(tong);
		}
	}
}