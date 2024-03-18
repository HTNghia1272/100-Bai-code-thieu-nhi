import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cv = (a + b) * 2;
			int dt = a * b;

			System.out.format(cv + " " + dt);
		}
	}
}
