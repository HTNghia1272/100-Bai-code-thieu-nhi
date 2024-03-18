import java.util.Scanner;

public class Bai58 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] occurrences = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 1;
            if (occurrences[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        occurrences[j] = 1;
                    }
                }
                occurrences[i] = 1;
                System.out.println(arr[i] + " " + count);
            }
        }
    }
}