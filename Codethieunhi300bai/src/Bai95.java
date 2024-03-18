import java.util.Scanner;

public class Bai95 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		double avarage = (double) sumArray(arr) / n;
		
		System.out.printf("%.1f", avarage);
	}
	
	public static int sumArray(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum;
	}
}