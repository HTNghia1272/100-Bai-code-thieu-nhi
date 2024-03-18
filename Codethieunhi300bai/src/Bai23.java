import java.util.Scanner;

public class Bai23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputArray = sc.nextLine().split(" ");

		int n = inputArray.length;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(inputArray[i]);
		}

		int count = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] > max && a[i] < 0) {
				max = a[i];
			}
			if (a[i] < 0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("-");
		} else {
			System.out.println(max);
		}
	}
}