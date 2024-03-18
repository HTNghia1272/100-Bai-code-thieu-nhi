import java.util.Scanner;

public class Bai33 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int dem = 0;

            for (int i = m; i <= n; i++) {
                boolean laSoNguyenTo = true;

                if (i < 2) {
                    laSoNguyenTo = false;
                } else {
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            laSoNguyenTo = false;
                            break;
                        }
                    }
                }

                if (laSoNguyenTo) {
                    dem++;
                }
            }

            System.out.println(dem);
        }
    }
}