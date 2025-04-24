package methods;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumber {
    public static void gerar(int[] num){
        Set<Number> adicionados = new HashSet<>();
        int randomNum=0;
        for(int count=0; count<6; count++){
            Random random = new Random();
            randomNum= 1+random.nextInt(60);
            do{
                random = new Random();
                randomNum= 1+random.nextInt(60);
            }
            while(adicionados.contains(randomNum));
            adicionados.add(randomNum);
            num[count] = randomNum;
        }
    }
    
}
