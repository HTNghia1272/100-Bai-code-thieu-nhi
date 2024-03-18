import java.util.Scanner;

public class Bai34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		printPrime(m, n);
		
		sc.close();
	}

	public static boolean isPrime(int num) {
		boolean isPrime = false;
		if (num < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void printPrime(int m, int n) {
		boolean foundPrime = false;

		for (int i = m; i <= n; i++) {
			if (isPrime(i)) {
				foundPrime = true;
				System.out.print(i + " ");
			}
		}
		
		if (!foundPrime) {
			System.out.println("-");
		}
	}
}