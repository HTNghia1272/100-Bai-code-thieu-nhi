import java.util.Scanner;

public class Bai60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
 		int n = input.length;
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}

		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			double squareRoot = Math.sqrt(arr[i]);
			if (squareRoot == Math.floor(squareRoot)) {
				sum += arr[i];
				count++;
			}
		}
		if (count > 0) {
			double average = (double) sum / (double) count;
			System.out.printf("%.1f", average);
		} else {
			System.out.println("-");
		}

	}
}