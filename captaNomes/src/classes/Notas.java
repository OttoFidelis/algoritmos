package classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Notas {
    public static void printNotas(){
        List<Double> notas = new ArrayList<Double>();
        for(int i=0; i<10; i++){
            String notaString = JOptionPane.showInputDialog("Digite a nota do aluno (digite ok para adicionar nota e cancelar para terminar)");
            if ((notaString == null || notaString.isBlank())&&!notas.isEmpty()) break;
            while((notaString==null||notaString.isBlank()&&notas.isEmpty())){
                JOptionPane.showMessageDialog(null, "Digite uma nota válida","erro",0);
                notaString = JOptionPane.showInputDialog("Digite a nota do aluno (digite ok para adicionar nota e cancelar para terminar)");
            }
            notas.add(Double.parseDouble(notaString));
        }
        Media.gerarMedia(notas);

    }
}
