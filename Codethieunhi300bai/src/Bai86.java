import java.util.Scanner;

public class Bai86 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double perimeter = calculatePerimeter(a, b, c);
		
		double Area = calculateArea(a, b, c);
		
		System.out.printf("%.1f %.3f", Area, perimeter);
	}

	public static double calculateArea(double a, double b, double c) {
		return a + b + c;
	}

	public static double calculatePerimeter(double a, double b, double c) {
		double s = (a + b + c) / 2.0;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}