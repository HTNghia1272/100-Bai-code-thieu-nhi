import java.util.Scanner;

public class Bai15 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			double cv = a + b + c;
			double p = cv / 2;
			double s = Math.sqrt(p * (p-a ) * (p-b) * (p - c));
			if ((a + b > c) && (a + c > b) && (b + c > a)) {
				System.out.println("Day la 3 canh cua mot tam giac");
				System.out.format("%.2f %.1f", cv, s);
			} else {
				System.out.println("Day khong phai la 3 canh cua mot tam giac");
			}
		}
	}
}