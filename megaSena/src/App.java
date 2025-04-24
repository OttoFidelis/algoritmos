import methods.Game;
import methods.RandomNumber;

public class App {
    public static void main(String[] args) throws Exception {
        int[] cartela = new int[61];
        int[] randomNum = new int[6];

        RandomNumber.gerar(randomNum);
        Game.play(cartela, randomNum);
    }
}
