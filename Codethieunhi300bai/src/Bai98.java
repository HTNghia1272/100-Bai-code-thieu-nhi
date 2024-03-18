import java.util.Scanner;

public class Bai98 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");

		int[] num = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}

		double average = averagePrime(num);
		if (countPrime(num) > 0) {
			System.out.printf("%.2f", average);
		} else {
			System.out.println("-");
		}
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
		for (int num : array) {
			if (isPrime(num)) {
				count++;
			}
		}
		return count;
	}

	public static double averagePrime(int[] array) {
		int count = countPrime(array);
		if (count == 0) {
			return 0;
		}
		int sum = 0;
		for (int num : array) {
			if (isPrime(num)) {
				sum += num;
			}
		}
		return (double) sum / count;
	}
}