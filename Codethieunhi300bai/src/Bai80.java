import java.util.Scanner;

public class Bai80 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x = sc.nextLine();
        
        int n = s.indexOf(x, 0);
        System.out.println(n);
       
    }
}