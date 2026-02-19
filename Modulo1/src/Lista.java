import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner en= new Scanner(System.in);
        String letra;
        List <String> nombres= new ArrayList<>(); //Creando una lista vacia
        //llenar con el metodo add
        nombres.add("Angel");
        nombres.add("Beto");
        nombres.add("Marisela");
        System.out.println(nombres);
        nombres.add(0,"Alejandra");
        //Filtrar los nombres que empiezan con la letra que el usuario proporciona
        System.out.println("Porque letra deseas que se filtre los nombres de la Lista");
        letra= en.nextLine();
        List<String> nombresConA = nombres.stream().filter(nombre->nombre.startsWith(letra.toUpperCase())).toList();
        System.out.println(nombresConA);

    }
}
