import java.util.Scanner;

public class ArreglosB {
    public static void main(String[] args) {
        Scanner en= new Scanner(System.in);
        int[][] ventas = new int[3][5];
        //El primer for anidado es para pedir los datos
        for(int filas=0; filas<ventas.length;filas++){
            for(int col=0; col<ventas[filas].length; col++){
                System.out.println("Ingresa las ventas que tuvo");
                ventas[filas][col]= en.nextInt();
            }
        }
        //El segundo es para mostrarlos
        for(int[] fila: ventas){
            for(int col: fila){
                System.out.print(col +"   ");
            }
            System.out.println(" ");
        }
    }
}
