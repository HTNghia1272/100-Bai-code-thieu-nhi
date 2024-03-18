import java.util.Scanner;

public class Bai89 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		int sum = 0;	
		for (int i = 0; i < m; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int result = tongGiaiThua(n, k);
			sum += result;
		}
		
		System.out.println(sum);
	}
	
	public static int tongGiaiThua(int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		} else {
			return tongGiaiThua(n - 1, k - 1) + tongGiaiThua(n - 1, k);
		}
	}
}