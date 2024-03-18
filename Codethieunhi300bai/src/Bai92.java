import java.util.Scanner;

public class Bai92 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result1 = Sum(Sum(a, b), c);
		double result2 = Divide(a, b) + c;
		double result3 = (double) a / (b + c);
		
		System.out.printf("%d %.2f %.3f" , result1, result2, result3);
	}
	
	public static int Sum(int a, int b) {
		return a + b;
	}
	
	public static double Divide(int a, int b) {
		return (double)a / b;
	}
}