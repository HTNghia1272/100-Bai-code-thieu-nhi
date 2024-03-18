import java.util.Scanner;

public class Bai56 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		int third = Integer.MAX_VALUE;

		boolean hasInput = false;
		while (scanner.hasNextInt()) {
			hasInput = true;

			int num = scanner.nextInt();

			if (num < first) {
                third = second;
                second = first;
                first = num;
            } else if (num < second) {
                third = second;
                second = num;
            } else if (num < third) {
                third = num;
            }
		}
		if (!hasInput || third == Integer.MAX_VALUE || third == second || third == first) {
			System.out.println("-");
		} else {
			System.out.println(third);
		}
	}
}