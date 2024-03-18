import java.util.Scanner;

public class Bai14 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			if (t > 0 & t <= 11) {
				System.out.println("Thieu nhi");
			} else if (t > 11 & t <= 25) {
				System.out.println("Thieu nien");
			} else if (t > 25 & t <= 50) {
				System.out.println("Trung nien");
			} else {
				System.out.println("Lao nien");
			}
		}
	}
}