import java.util.Scanner;

public class Bai81 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x = sc.nextLine();
        
        int lastIndex = s.lastIndexOf(x);
        
        System.out.println(lastIndex);
       
    }
}