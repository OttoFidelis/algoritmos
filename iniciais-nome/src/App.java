import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite o seu nome completo");
        String full_name = keyboard.nextLine();
        List <String> last_names = new ArrayList<>();
        String saida = "";

        while(full_name.indexOf(" ")!=-1){
            last_names.add(full_name.substring(0, full_name.indexOf(" ")));
            full_name = full_name.replaceAll(full_name.substring(0, full_name.indexOf(" ")+1), "");
        }

        last_names.add(full_name);

        for(String nome:last_names){
            saida += nome.substring(0,1);
        }

        System.out.println(saida);
    }
}