import java.util.Scanner;

public class Bai49 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			int max = a[0];
			int locate = 0;
			
			for (int i = 0; i < n; i++) {
				if (a[i]> max) {
					max = a[i];
					locate = i;
				}
			}
			System.out.print(max + " " + locate);
		}
	}
}