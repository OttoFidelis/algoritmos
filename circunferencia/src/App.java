import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Informe o diâmetro (em metros)");
        double d = keyboard.nextDouble();
        double r = d/2;
        double pi = Math.PI;
        double circ = pi*r*2;

        System.out.println("Dados do círculo:");
        System.out.printf("-Área:               %7.1f\n" , pi*Math.pow(r,2));
        System.out.printf("-Raio:               %7.1f\n" , r);
        System.out.printf("-Circunferência:     %7.1f\n" , circ);
    }
}
