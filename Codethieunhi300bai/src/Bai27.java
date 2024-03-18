import java.util.Scanner;

public class Bai27 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int tong = 0;
			for (int i = 1; i <=n; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					tong += i;
				}
			}
			System.out.println(tong);
		}
	}
}