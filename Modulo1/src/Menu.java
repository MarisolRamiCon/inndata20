import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("""
                1. Peliculas
                2. Libros
                3. Revistas
                0. Salir
                """);
        int opcion;
        do{
            System.out.println("¿A qué opcion quieres ingresar?. Ingresa 0 para salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Hasta luego");
                    break;
                case 1:
                    System.out.println("""
                            La era de hielo 1
                            La era de hielo 2
                            La era de hielo 3
                            """);
                    break;
                case 2:
                    System.out.println("""
                            Caperucita Roja
                            El conde de Montecristo
                            Patito feo
                            """);
                    break;
                case 3:
                    System.out.println("""
                            Revista 1
                            Revista 2
                            Revista 3 
                            """);
                    break;
                default:
                    System.out.println("Esa no es una opción");
                    break;
            }
        }while(opcion!=0);
    }


}
