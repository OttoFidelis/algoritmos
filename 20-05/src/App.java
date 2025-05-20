import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        char[] caracteres = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L','M', 'N', 'O', 'P',
                            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '!','0','1','2','3','4','5','6','7','8','9', '@', '#', '$', '%', '&'};
        
        String codigo="";

        for(int i=0; i<3;i++){
            Random random = new Random();
            codigo+=caracteres[random.nextInt(26)];
        }
        for(int i=0; i<3;i++){
            Random random = new Random();
            codigo+=caracteres[random.nextInt(26)+25];
        }
        Random random = new Random();
        codigo+=caracteres[random.nextInt(10)+51];
        codigo+=caracteres[random.nextInt(5)+61];

        char[] codigoFormado = codigo.toCharArray();

        List<String> codigoList = new ArrayList<>();
        for(char i:codigoFormado){
            codigoList.add(""+i);
        }
        codigo="";
        Collections.shuffle(codigoList);
        for(String i:codigoList){
            codigo+=i;
        }
        System.out.println(codigo);
}
}
