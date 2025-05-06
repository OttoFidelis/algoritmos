import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int num1 = keyboard.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int num2 = keyboard.nextInt();

        Random random = new Random();

        if (num1>num2) System.out.println(random.nextInt(num1-num2+1)+num2);
        if (num2>num1) System.out.println(random.nextInt(num2-num1+1)+num1);
    }
}
