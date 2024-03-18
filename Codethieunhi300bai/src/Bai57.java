import java.util.Scanner;

public class Bai57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int count = 0;
		
		while (sc.hasNext()) {
			int num = Integer.parseInt(sc.nextLine());
			if (num == 0) {
				break;
			}
			boolean exists = false;
			for (int i = 0; i < count; i++) {
				if (arr[i] == num) {
					exists = true;
					break;
				}
			}

			if (!exists) {
				arr[count] = num;
				count++;
			}
			
		}
		
		System.out.println(count);
	}
}