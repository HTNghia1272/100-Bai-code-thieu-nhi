import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int r = sc.nextInt();
			double cv = r * 2 * 3.14;
			double dt = r * r * 3.14;

			System.out.format("%.2f %.2f" , cv, dt);
		}
	}
}