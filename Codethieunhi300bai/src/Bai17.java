import java.util.Scanner;

public class Bai17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		if (t >= 2 && t <= 4) {
			System.out.println("Mua Xuan");
		} else if (t >= 5 && t <= 7) {
			System.out.println("Mua Ha");
		} else if (t >= 8 && t <= 10) {
			System.out.println("Mua Thu");
		} else if (t == 11 || t == 12 || t == 1) {
			System.out.println("Mua Dong");
		} else {
			return;
		}
	}
}