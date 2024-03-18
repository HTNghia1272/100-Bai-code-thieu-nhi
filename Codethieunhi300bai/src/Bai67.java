import java.util.Scanner;

public class Bai67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int endIndex = s.length() - 1;

		while (endIndex >= 0 && s.charAt(endIndex) == ' ') {
			endIndex--;
		}
		
		
		if (endIndex >= 0) {
			System.out.println(s.substring(0, endIndex + 1));
		}
	}
}