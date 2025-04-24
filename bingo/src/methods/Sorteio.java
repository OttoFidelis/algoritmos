package methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteio {
    public static void sortear(int[][] cartela){
       List<Integer> numerosSortados = new ArrayList<>();
       List<Integer> answers = new ArrayList<>();
       int count = 0;
       int sorteios = 0;
       
       for(int i=0;i<75;i++){
        numerosSortados.add(i+1);
       }
       Collections.shuffle(numerosSortados);

       for(int i:numerosSortados){
        for(int col=0; col<5; col++){
            for(int row=0; row<5; row++){
                if(cartela[row][col] == i){
                    count++;
                    answers.add(i);
                }
            }
           }
           sorteios++;
           if(count ==25) break;
       }
       System.out.println("Acertos: "+answers);
       System.out.println("Foram necessários " + sorteios+" sorteios");
    }
}
