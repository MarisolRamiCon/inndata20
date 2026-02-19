import java.util.Scanner;

public class Registro {
    static void verificarEdad(int edad){
        if(edad<18){
            //throw detiene el flujo y lanza un error
            throw new RuntimeException("Acceso denegado: Debes tener al menos 18 años");
        }else{
            System.out.println("Acceso concedido");
        }
    }

    public static void main(String[] args) {
        Scanner en= new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad para ver si se te da acceso");
        edad=en.nextInt();
        try{
            verificarEdad(edad);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
