import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			float cv = a + b + c;
			float p = cv / 2;
			double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			double R = (a * b * c) / (4 * s);
			System.out.format("%.3f", R);
		}
	}
}