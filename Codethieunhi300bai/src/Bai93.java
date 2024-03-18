import java.util.Scanner;

public class Bai93 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = min(min(a, b), c);
		
		System.out.println(result);
	}
	
	public static int min(int a, int b) {
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}
}