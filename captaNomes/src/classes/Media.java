package classes;
import java.util.List;

public class Media {
    public static String totalNotas="";
    public static double media=0;
    public static void gerarMedia(List<Double> notas){
        for(double nota:notas){
            media+=nota;
        }
        media/=notas.size();
        for(double nota:notas){
            totalNotas+=nota;
            if(notas.get(notas.size()-1)==nota) break;
            totalNotas+=", ";
        }
    }
    
}
