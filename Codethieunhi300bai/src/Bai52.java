import java.util.ArrayList;
import java.util.Scanner;

public class Bai52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int[] arr = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}

		averagePrime(arr);

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

	public static void averagePrime(int[] arr) {
		ArrayList<Integer> primes = new ArrayList<>();
		int sum = 0;
		int count = 0;
		for (int num : arr) {
			if (isPrime(num)) {
				primes.add(num);
				sum += num;
				count++;
			}
		}

		if (primes.isEmpty()) {
			System.out.println("-");
		} else {
			double average = (double) sum / count;
			System.out.printf("%.2f", average);
		}

	}
}