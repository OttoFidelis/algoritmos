import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Media;
import classes.Nome;
import classes.Notas;

public class App {
    public static void main(String[] args) throws Exception {
        Nome.printNome();
        Notas.printNotas();
        
        JOptionPane.showMessageDialog(null, "Nome do aluno: "+Nome.nome+"\nnotas: "+Media.totalNotas+"\nmédia: "+Media.media);
    }
}