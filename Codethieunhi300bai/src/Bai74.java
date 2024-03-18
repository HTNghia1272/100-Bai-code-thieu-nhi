import java.util.Scanner;

public class Bai74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String[] word = s.split(" ");

		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}
	}
}