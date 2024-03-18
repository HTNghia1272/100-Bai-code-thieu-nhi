import java.util.Scanner;

public class Bai59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int maxCount = 0;
		int mostNumber = arr[0];
		
		int[] occurence = new int[n];
		for (int i = 0; i < n; i++) {
			int count = 1;
			if (occurence[i] == 0) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] == arr[j]) {
						count++;
						occurence[j] = 1;
					}
				}
				occurence[i] = 1;
				if (count > maxCount) {
					maxCount = count;
					mostNumber = arr[i];
				}
				
			}
			
		}
		System.out.println(mostNumber + " " + maxCount);
	}
}