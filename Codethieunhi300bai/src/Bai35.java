import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai35 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int tong = 0;
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
					tong += i;
					dem++;
				}
			}
			if (dem == 0) {
				System.out.println("-");
			}
			
			DecimalFormat df = new DecimalFormat("0.00");
			double tbc = (double)tong / (double)dem;
			System.out.format(df.format(tbc));
		}
	}
}
