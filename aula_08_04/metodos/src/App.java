import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner tcd = new Scanner(System.in);

        int a = tcd.nextInt();
        int b = tcd.nextInt();
        int c = tcd.nextInt();

        if (a > b && (b < c || b == c))
            System.out.println(":)");
        if (a < b && (b > c || b == c))
            System.out.println(":(");
        if (a < b && b < c) {
            c -= b;
            b -= a;
            if (c >= b)
                System.out.println(":)");
            else
                System.out.println(":(");
            }
            if (a > b && b > c) {
                c -= b;
                b -= a;
                if (c >= b)
                    System.out.println(":)");
                else
                    System.out.println(":(");
            }
            if (a == b) {
                if (b < c)
                    System.out.println(":)");
                else
                    System.out.println(":(");
            }
        
    }
}
