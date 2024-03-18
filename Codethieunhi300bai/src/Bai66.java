import java.util.Scanner;

public class Bai66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int startIndex = 0;

		while (startIndex < s.length() && s.charAt(startIndex) == ' ') {
			startIndex++;
		}
		
		
		if (startIndex < s.length()) {
			System.out.println(s.substring(startIndex));
		}
	}
}