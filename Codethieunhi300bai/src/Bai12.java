import java.util.Scanner;

public class Bai12 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int soDau = n / 10;
			int soCuoi = n % 100;
			System.out.format("%02d %02d", soDau, soCuoi);
		}
	}
}