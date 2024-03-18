import java.util.Scanner;

public class Bai100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Max(arr);
		Min(arr);
	}

	public static void Max(int[] arr) {
		int max = Integer.MIN_VALUE;
		int locate = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				locate = i;
			}
		}
		System.out.println(max + " " + locate);
	}

	public static void Min(int[] arr) {
		int min = Integer.MAX_VALUE;
		int locate = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				locate = i;
			}
		}
		System.out.println(min + " " + locate);
	}
}