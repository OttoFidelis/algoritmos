import java.util.Random;

public class GerarNumero {
    public static void gerar(int[] num){
        for(int count=0; count<6; count++){
            Random random = new Random();
            num[count] = 1+random.nextInt(60);
        }
    }
    
}
