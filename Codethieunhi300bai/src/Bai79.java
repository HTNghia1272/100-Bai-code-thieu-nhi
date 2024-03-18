import java.util.Scanner;

public class Bai79 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.toLowerCase().replaceAll("\\s", "");

        int[] charCount = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            charCount[currentChar]++;
        }

        int maxCount = 0;
        char mostChar = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (charCount[currentChar] > 0) {
            	if (charCount[currentChar] > maxCount) {
                    maxCount = charCount[currentChar];
                    mostChar = currentChar;	
                }
            }
            charCount[currentChar] = 0;
        }
        System.out.println(mostChar + ":" + maxCount);
    }
}