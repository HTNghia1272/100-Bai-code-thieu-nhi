import java.util.Scanner;

public class Bai22 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int tien = 0;
			if (n <= 50) {
				tien = n * 600;
			} else if (n <= 100 && n > 50) {
				tien = 50 * 600 + (n - 50) * 800;
			} else if (n <= 200 && n > 100) {
				tien = 50 * 600 + 50 * 800 + (n - 100) * 1100;
			} else {
				tien = 50 * 600 + 50 * 800 + 100 * 1100 + (n - 200) * 1500;
			}
			System.out.println(tien);
		}
	}
}