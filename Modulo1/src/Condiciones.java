import java.util.Scanner;

public class Condiciones {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        byte edad;
        System.out.println("Ingresa tu edad y te dire si eres mayor");
        edad= entrada.nextByte();
        if(edad>=65){
            System.out.println("Ya puedes recibir tu pensión");
        }else{
            if(edad>=18){
                System.out.println("Sigue trabajando");
            }else{
                System.out.println("Diviertete jugando");
            }
        }
    }
}
