  import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			if (N > 1000000 || N % 1000 != 0) {
				return;
			}
			int soTien5k = N / 5000;
			int soTien2k = (N % 5000) / 2000;
			int soTien1k = (N % 5000 % 2000);
			System.out.println(soTien5k + " " + soTien2k + " " + soTien1k);
		}
	}
}