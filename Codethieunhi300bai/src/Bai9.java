import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double tb = (a * 2 + b * 2 + c) / 5;
			System.out.format("%.1f", tb);
		}
	}
}