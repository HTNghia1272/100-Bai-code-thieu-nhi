import java.util.Scanner;

public class Bai21 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int tien = 0;
			if (n <= 1) {
				tien = n * 12000;
			} else if (n <= 30 && n > 1) {
				tien = 1 * 12000 + (n - 1) * 10000;
			} else {
				tien = 1 * 12000 + 29 * 10000 + (n - 30) * 9000;
			}
			System.out.println(tien);
		}
	}
}