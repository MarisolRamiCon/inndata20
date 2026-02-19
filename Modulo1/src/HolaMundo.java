import java.util.Scanner;

public class HolaMundo { //clase de acceso publico
    public static void main(String[] args) { //metodo main que permite ejecutar el programa
        //Instanciando un objeto de Scanner
        Scanner entrada= new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre= entrada.nextLine();
        System.out.println("Ingresa tu edad");
        byte edad= entrada.nextByte();
        System.out.println("Hola ");
        System.out.print("Tu nombre es " + nombre + " tu edad es "+ edad);

        /*
        System.out.println obliga a que haya un salto de linea en cada impresion
        mientras que system.out.print imprime en la misma linea
         */
    }
}
