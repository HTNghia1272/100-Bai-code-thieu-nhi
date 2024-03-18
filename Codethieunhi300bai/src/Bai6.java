import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			float a = sc.nextInt();
			float b = sc.nextInt();
			float c = sc.nextInt();
			float cv = a + b + c;
            float p = cv/2;
            double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.format("%.1f %.3f", cv, s);
		}
	}
}