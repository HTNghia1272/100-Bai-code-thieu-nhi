import java.util.Scanner;

public class Bai68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String result = s.replaceAll("\\s+", " ");

		System.out.print(result);
	}
}