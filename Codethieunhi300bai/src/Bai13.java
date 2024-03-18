import java.util.Scanner;

public class Bai13 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int max = a;
			if (b > max) {
				max = b;
				System.err.println(max);
			}
			else if (c > max) {
				max = c;
				System.err.println(max);
			} else if (a == b & a == c) {
				System.out.println("=");
			}
		}
	}
}