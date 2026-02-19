import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String nombre;
        System.out.println("¿Cuál es tu nombre?");
        nombre= in.nextLine();
        String respuesta= (nombre.length()==3)?("Es un nombre muy corto"):("Es un nombre largo");
        System.out.println(respuesta);
    }
}
