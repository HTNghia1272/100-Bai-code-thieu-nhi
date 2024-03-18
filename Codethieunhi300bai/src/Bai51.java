import java.util.ArrayList;
import java.util.Scanner;

public class Bai51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int[] arr = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}

		printAndSumPrime(arr);

		sc.close();
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void printAndSumPrime(int[] arr) {
		ArrayList<Integer> primes = new ArrayList<>();
		int sum = 0;

		for (int num : arr) {
			if (isPrime(num)) {
				primes.add(num);
				sum += num;
			}
		}

		if (primes.isEmpty()) {
			System.out.println("-");
		} else {
			for (int prime : primes) {
				System.out.print(prime + " ");
			}
			System.out.println();
		}

		System.out.println(sum);
	}
}