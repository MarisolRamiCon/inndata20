import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int num, n;
        List<Integer> numeros = new ArrayList<>();
        try {
            System.out.println("¿Cuántos numeros quieres ingresar?");
            num = en.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("Ingresa un numero");
                n = en.nextInt();
                numeros.add(n);
            }
            System.out.println(numeros);
        } catch (Exception e) {
            System.out.println("Se piden numeros y colocas letras o simbolos");
            System.out.println("Error "+ e);
        }
        //Dependiendo de lo que ingrese el usuario voy a hacer una lista donde duplico sus valores
        List<Integer> duplicados= numeros.stream().map(numero-> numero*2).toList();
        System.out.println(duplicados);

        System.out.println(numeros.stream().sorted().toList());
        System.out.println("Numero de elementos: "+numeros.stream().count());

    }
}
