import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (j < n - i - 1) {
                    System.out.print(" ");
                } else if (j < n + i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
