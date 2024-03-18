import java.util.Scanner;

public class Bai78 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.toLowerCase();
        
        int[] charCount = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            charCount[currentChar]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (charCount[currentChar] > 0) {
                System.out.print(currentChar + ":" + charCount[currentChar] + " ");
                charCount[currentChar] = 0;
            }
        }
    }
}