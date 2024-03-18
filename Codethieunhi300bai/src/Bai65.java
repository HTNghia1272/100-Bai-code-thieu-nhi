import java.util.Scanner;

public class Bai65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int length = s.length();
		boolean isPalindrome = true;
		for (int i = 0; i < length / 2; i++) {
			int j = length - i - 1;
			if (s.charAt(i) != s.charAt(j)) {
				isPalindrome = false;
				break;
			}

		}

		if (isPalindrome) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}