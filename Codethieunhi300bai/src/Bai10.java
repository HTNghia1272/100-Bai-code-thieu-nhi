import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			int hs = sc.nextInt();
			int chia = t / hs;
			int du = (t % hs);
			System.out.print(chia + " " + du);
		}
	}
}