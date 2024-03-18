import java.util.Scanner;

public class Bai38 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();
			int count = 0;
			int n = 2;

			while (count < k) {
				boolean laSoNguyenTo = true;

				if (n >= 2) {
					int i = 2;
					while (i <= Math.sqrt(n)) {
						if (n % i == 0) {
							laSoNguyenTo = false;
							break;
						}
						i++;
					}
				} else {
					laSoNguyenTo = false;
				}

				if (laSoNguyenTo) {
					System.out.print(n + " ");
					count++;
				}

				n++;
			}
		}
	}
}