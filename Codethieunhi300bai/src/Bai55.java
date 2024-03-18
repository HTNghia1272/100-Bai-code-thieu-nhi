import java.util.Scanner;

public class Bai55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputArray = sc.nextLine().split(" ");

		int n = inputArray.length;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(inputArray[i]);
		}
		
		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				secondMax = max;
				max = a[i];
			} else if (a[i] > secondMax && a[i] != max) {
				secondMax = a[i];
			}
		}

		if (secondMax == max) {
			System.out.println("-");
		} 
		System.out.println(secondMax);

	}
}