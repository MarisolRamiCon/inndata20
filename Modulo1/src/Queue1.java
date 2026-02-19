import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Character> letras = new PriorityQueue<>();
        //enqueue es cuando lo ingresamos
        letras.add('C');
        letras.offer('A');
        letras.offer('T');
        letras.offer('a');
        System.out.println(letras);
        while(!letras.isEmpty()){
            System.out.println("El próximo en ser atendido es "+ letras.element());
            letras.remove();
            System.out.println(letras);
        }
        System.out.println(letras.poll());
        System.out.println(letras.peek());


    }
}
