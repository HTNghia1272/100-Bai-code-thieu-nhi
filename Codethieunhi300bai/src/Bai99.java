import java.util.Scanner;

public class Bai99 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int[] arr = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}

		int count = countPerfectSquare(arr);
		double average = averagePerfectSquare(arr);
		if (count == 0) {
			System.out.println("-");
		} else {
			System.out.printf("%.1f", average);
		}
		sc.close();
	}

	public static boolean isPerfectSquare(int n) {
		if (n < 0) {
			return false;
		} else {
			int sqrt = (int) Math.sqrt(n);
			return sqrt * sqrt == n;
		}
	}

	public static int countPerfectSquare(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (isPerfectSquare(num)) {
				count++;
			}
		}
		return count;
	}

	public static double averagePerfectSquare(int[] arr) {
		int count = countPerfectSquare(arr);
		int sum = 0;
		for (int num : arr) {
			if (isPerfectSquare(num)) {
				sum += num;
			}
		}
		if (count == 0) {
			return 0;
		} else
		return (double) sum / count;
	}
}