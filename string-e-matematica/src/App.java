import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite apenas os números do seu CPF");
        long cpf_number = keyboard.nextLong();
        String cpf_input = cpf_number + "";

        if (cpf_input !=null)
        while(cpf_input.length()!=11){
            System.out.println("Digite um cpf válido");
            cpf_input = keyboard.next();
        }

        String first_part_cpf = cpf_input.substring(0, 3);
        String second_part_cpf = cpf_input.substring(3,6);
        String third_part_cpf = cpf_input.substring(6,9);
        String fourth_part_cpf = cpf_input.substring(9,11);

        System.out.println(first_part_cpf + "." + second_part_cpf + "." +third_part_cpf + "-" + fourth_part_cpf);
    }
}
