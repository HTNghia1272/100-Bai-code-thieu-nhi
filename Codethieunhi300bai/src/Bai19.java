import java.util.Scanner;

public class Bai19 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int tong = 0;
			int tempSoXe = x;
			while (tempSoXe > 0) {
				tong += tempSoXe % 10;
				tempSoXe /= 10;
			}
			int soNut = tong % 10;

			if (soNut == 9) {
				System.out.println(soNut);
				System.out.println("may man");
			} else {
				System.out.println(soNut);
				System.out.println("chua may man");
			}
		}
	}
}