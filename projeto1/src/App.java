import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner tcd = new Scanner(System.in);
        int num = tcd.nextInt();
        String bin = "";
        while (num > 1) {
            int resto = num % 16;
            switch (resto) {
                case 10:
                    bin += "A";
                    break;

                case 11:
                    bin += "B";
                    break;

                case 12:
                    bin += "C";
                    break;

                case 13:
                    bin += "D";
                    break;

                case 14:
                    bin += "E";
                    break;

                case 15:
                    bin += "F";
                    break;

                default:
                    bin += resto;
                    break;
            }
            num /= 16;
        }
        if (num != 0)
            bin += num;
        String binReverse = new StringBuilder(bin).reverse().toString();
        System.out.println("Versão hexadecimal do número: "+binReverse);

    }
}