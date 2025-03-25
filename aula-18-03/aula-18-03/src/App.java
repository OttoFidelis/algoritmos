import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        Scanner tcd = new Scanner(System.in);
        int number1;
        long number2;

        System.out.println("Digite o primeiro número: ");
        number1 = tcd.nextInt();
        System.out.println("Digite o segundo número: ");
        number2 = tcd.nextLong();
        tcd.close();

        while(number1<number2){
            System.out.println("Falta " + (number2-number1));
            number1*=number1;
        }
        
    }
}
