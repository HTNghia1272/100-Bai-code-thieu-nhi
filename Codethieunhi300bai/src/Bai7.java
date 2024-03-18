import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int h = sc.nextInt();
			double s = (double) (a * h) / 2;
			System.out.format("%.2f", s);
        }
	}
}