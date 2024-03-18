import java.util.Scanner;

public class Bai76 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char s2 = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2) {
                count++;
            }
        }

        System.out.println(count);
    }
}