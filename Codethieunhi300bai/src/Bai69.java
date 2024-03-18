import java.util.Scanner;

public class Bai69 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String[] words = s.split("\\s+");
            int count = 0;
            for (String word : words) {
            	if(!word.isEmpty()) {
                    count++;
            	}
            }
            System.out.println(count);
        }
    }
}