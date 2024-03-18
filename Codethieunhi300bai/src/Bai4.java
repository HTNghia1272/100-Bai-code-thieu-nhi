import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tong = (a + b);
			int tich = a * b;

			System.out.format(tong + " " + tich);
		}
	}
}
