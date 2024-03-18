import java.util.Scanner;

public class Bai29 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			boolean laSoNguyenTo = true;
			if (n < 2) {
				laSoNguyenTo = false;
			}
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					laSoNguyenTo = false;
					break;
				}
			}
			if (laSoNguyenTo) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}