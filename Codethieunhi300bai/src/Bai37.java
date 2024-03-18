import java.util.Scanner;

public class Bai37 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			int m = sc.nextInt();
			int a = t;
			int b = m;
			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}

			int ucln = a;

			System.out.println(t / ucln + "/" + m / ucln);
		}
	}
}