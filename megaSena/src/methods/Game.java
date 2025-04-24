package methods;

import java.util.Scanner;

public class Game {
    public static void play(int[] cartela, int[] randomNum){
        int countNumCorretos = 0;
        Scanner tcd = new Scanner(System.in);
        int num = 0;
        int countPalpites = 0;

        for (int palpites = 0; palpites < 6; palpites++) {
            System.out.println("Digite um número de 1 de 60");
            num = tcd.nextInt();
            for (int posicao = 0; posicao < 61; posicao++) {
                if(num==posicao && num>0 && num!=cartela[posicao]){
                    cartela[posicao] = num;
                    countPalpites = palpites;
                }
                else if(num<=0 || num>60){
                    System.out.println("Número inválido");
                    countPalpites = palpites;
                    palpites = countPalpites-1;
                }
                else if(num==cartela[posicao]){
                    System.out.println("Este número já foi digitado");
                    countPalpites = palpites;
                    palpites = countPalpites-1;
                }
            }
        }

        for(int numCartela:cartela){
            for(int numSorteado=0; numSorteado<6; numSorteado++){
                if(cartela[numCartela] == randomNum[numSorteado]){
                    countNumCorretos++;
                }
            }
        }
        if(countNumCorretos == 6) System.out.println("Você ganhou!");
        else System.out.println("Você perdeu!");
    }
}
