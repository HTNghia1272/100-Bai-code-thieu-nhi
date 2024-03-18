import java.util.Scanner;

public class Bai32 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int dem = 0;
			int tong = 0;
			for (int i = m; i <= n; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					dem++;
				}
				if (i % 2 == 0) {
					tong += i;
				}
			}
			System.out.println(dem + " " + tong);
		}
	}
}