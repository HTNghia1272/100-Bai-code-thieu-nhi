import java.util.Scanner;

public class Bai53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputArray = sc.nextLine().split(" ");

		int n = inputArray.length;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(inputArray[i]);
		}
		
		int count = 0;
		int sum = 0;
		int maxPrime = 2;
		
		for (int i = 0; i < n; i++) {
			boolean isPrime = true;

			if (a[i] <= 1) {
				isPrime = false;
			} else {
				for (int j = 2; j <= Math.sqrt(a[i]); j++) {
					if (a[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			
			if (isPrime) {
				count++;
			}
			if (isPrime && a[i] > maxPrime) {
				maxPrime = a[i];
			}
		}

		if (count == 0) {
			System.out.println("-");
		} 
		System.out.println(maxPrime);

	}
}