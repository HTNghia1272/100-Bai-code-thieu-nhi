import java.util.Scanner;

public class Bai87 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(chiaHetCho5(n)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
	}
	
	public static boolean chiaHetCho5(int n) {
		if (n % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}
}