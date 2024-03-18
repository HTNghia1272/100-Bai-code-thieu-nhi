import java.util.Scanner;

public class Bai85 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("\\s+");

        if (words.length >= 2) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < words.length - 1; i++) {
                result.append(words[i]).append(" ");
            }
            System.out.println(result.toString().trim());
        } else {
            System.out.println("Không đủ từ để in.");
        }
    }
}