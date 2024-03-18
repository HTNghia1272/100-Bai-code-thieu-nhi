import java.util.Scanner;

public class Bai40 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();
			int count = 0;
			int i = 0;
			while (count < k) {
				int n = i * i;
				System.out.print(n + " ");
				count++;
				i++;
			}
			
		}
	}
}