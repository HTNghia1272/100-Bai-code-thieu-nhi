import java.util.Scanner;

public class Bai71 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x = sc.nextLine();
        String y = sc.nextLine();

        String ss = s.replace(x, y);
        
        System.out.println(ss);
    }
}