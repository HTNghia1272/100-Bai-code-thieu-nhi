import java.util.Scanner;

public class Bai70 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

            String result = capitalizeAllFirstCharacters(s);
            System.out.println(result);
    }

    private static String capitalizeAllFirstCharacters(String input) {
        StringBuilder result = new StringBuilder();
        boolean isWordStart = true;

        for (char c : input.toCharArray()) {
            if (isLetter(c)) {
                if (isWordStart) {
                    result.append(toUpperCase(c));
                    isWordStart = false;
                } else {
                    result.append(c);
                }
            } else {
                result.append(c);
                isWordStart = true;
            }
        }

        return result.toString();
    }

    private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private static char toUpperCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char) (c - 'a' + 'A');
        }
        return c;
    }
}