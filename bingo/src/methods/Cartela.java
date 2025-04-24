package methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Cartela {
    public static void criar(int [][]cartela){
        int num=0;
        Set<Number>adicionados = new HashSet<>();
        for(int col=0; col<5; col++){
        for(int row=0; row<5; row++){
            Random random = new Random();
            num = random.nextInt(15)+(col*15+1);
            do{
                random = new Random();
                num = random.nextInt(15)+(col*15+1);
            }
            while(adicionados.contains(num));
            adicionados.add(num);
            cartela[row][col] = num;
        }
       }

       for(int[]row : cartela){
        System.out.println(Arrays.toString(row));
       }
    }
}
