import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        Set<Integer> conjunto1= new TreeSet<>();
        conjunto1.add(5);
        conjunto1.add(5);
        System.out.println(conjunto1);
        conjunto1.add(10);
        conjunto1.add(20);
        System.out.println(conjunto1);
        if(conjunto1.contains(25)){
            System.out.println("El conjunto tiene el numero 25");
        }else{
            System.out.println("No tiene el 25");
        }
    }
}
