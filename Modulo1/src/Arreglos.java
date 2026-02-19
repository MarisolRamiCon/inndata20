import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        //Crear arreglo vacio
        String [] nombres= new String[3];
        for(int i=0; i< nombres.length; i++){
            System.out.println("Ingresa un nombre ");
            nombres[i]= in.nextLine();
        }
        //For each
        for(String n:nombres){
            //Mostrar solo los nombres que empiezan con n
            if(n.startsWith("N")){
                System.out.print(n + ",   ");
            }
        }

    }
}
