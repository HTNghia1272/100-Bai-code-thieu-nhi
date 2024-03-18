import java.util.Scanner;

public class Bai25 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int tong = 0;
			for (int i = 1; i <=n; i++) {
				if (i % 2 == 0) {
					tong += i;
				}
			}
			System.out.println(tong);
		}
	}
}