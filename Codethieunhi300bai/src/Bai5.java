import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			float a = sc.nextInt();
			float b = sc.nextInt();
			float c = sc.nextInt();
			float tbc = (a + b + c) / 3;
			DecimalFormat df = new DecimalFormat("0.0");

			System.out.println(df.format(tbc));
		}
	}
}