import java.util.Scanner;

public class Bai91 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int r = sc.nextInt();
		
		drawRectangle(d, r);

		sc.close();
	}

	public static void drawRectangle(int d, int r) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < d; j++) {
				if (i == 0 || i == r - 1 || j == 0 || j == d - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}