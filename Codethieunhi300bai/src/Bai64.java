import java.util.Scanner;

public class Bai64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] words = s.split(" ");

		for (String word : words) {
			System.out.print(word);
		}
 	}
}