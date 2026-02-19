import java.util.Scanner;

public class Tablas {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("¿Qué tabla quieres?");
        int resultado;
        int tabla= entrada.nextInt();
        for(int i=1;i<=10;i++){
            resultado= tabla * i;
            System.out.println(tabla + " x " + i + " = "+resultado);

        }
    }
}
