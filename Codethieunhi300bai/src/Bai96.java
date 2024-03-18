import java.util.Scanner;

public class Bai96 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		double avarage = calculateEvenArray(arr);

		System.out.printf("%.2f\n", avarage);
		
		sc.close();
	}

	public static int sumEvenArray(int[] array) {
		int sum = 0;
		for (int num : array) {
			if (num % 2 == 0) {
				sum += num;
			}
		}
		return sum;
	}
		
	public static double calculateEvenArray(int[] array) {
		int evenSum = sumEvenArray(array);
		int evenCount = 0;
		
		for (int num : array) {
			if (num % 2 == 0) {
				evenCount++;
			}
		}
		
		if (evenCount == 0) {
			return 0;
		}
		
		return (double) evenSum / evenCount;	
	}
}