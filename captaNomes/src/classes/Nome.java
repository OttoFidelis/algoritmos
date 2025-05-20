package classes;

import javax.swing.JOptionPane;

public class Nome {
    public static String nome = JOptionPane.showInputDialog("Informe o nome do aluno");
    public static void printNome(){

        while(nome.length()<2||nome.length()>50||nome==null||nome.isBlank()){
            JOptionPane.showMessageDialog(null, "Digite um nome válido","erro",0);
            nome = JOptionPane.showInputDialog("Informe o nome do aluno");
        }
    }
}
