import java.util.Scanner;

public class Bai77 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i), i + 1) == -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}