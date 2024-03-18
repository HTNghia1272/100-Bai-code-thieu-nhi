import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float tbcn = (a + b * 2) /3;
			DecimalFormat df = new DecimalFormat("0.0");
			if (tbcn >= 8) {
				System.out.println(df.format(tbcn));
				System.out.println("Gioi");
			} else if (tbcn >= 6.5 && tbcn < 8) {
				System.out.println(df.format(tbcn));
				System.out.println("Kha");
			} else if (tbcn >= 5 && tbcn < 6.5) {
				System.out.println(df.format(tbcn));
				System.out.println("Trung binh");
			} else if (tbcn >= 3.5 && tbcn < 5) {
				System.out.println(df.format(tbcn));
				System.out.println("Yeu");
			} else {
				System.out.println(df.format(tbcn));
				System.out.println("Kem");
			}
		}
	}
}