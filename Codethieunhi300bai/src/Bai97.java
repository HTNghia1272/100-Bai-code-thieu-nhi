import java.util.Scanner;

public class Bai97 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		
		int[] num = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		
		int count = countPrime(num);
		System.out.println(count > 0 ? count : "-");
	}
	
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int countPrime(int[] array) {
		int count = 0;
		for (int n : array) {
			if (isPrime(n)) {
				count++;
			}
		}
		return count;
	}
}