import java.util.Scanner;

public class Bai24 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int dem = 0;
			for (int i = 1; i <=n; i++) {
				if (i % 3 == 0) {
					dem++;
				}
			}
			System.out.println(dem);
		}
	}
}