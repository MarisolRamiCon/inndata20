import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Calificaciones {
    public static void main(String[] args) {
        Map<String,Double> materias= new LinkedHashMap<>();
        materias.put("matematicas", 6.5);
        materias.put("español",8.5);
        materias.put("quimica",8.0);
        System.out.println(materias);
        materias.replace("matematicas",9.8);
        for(String clave: materias.keySet()){
            System.out.println(clave +" -> "+ materias.get(clave));
        }
        materias.put("quimica",9.0);
        System.out.println(materias);


    }
}
