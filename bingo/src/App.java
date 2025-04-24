import methods.Cartela;
import methods.Sorteio;

public class App {
    public static void main(String[] args) {
        int[][] cartela = new int[5][5];

        Cartela.criar(cartela);
        Sorteio.sortear(cartela);  
    }
}