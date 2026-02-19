package POO;

public class Tortuga extends Animal implements Maritimo,Terrestre{
    @Override
    public void caminar() {
        System.out.println("La tortuga camina lentamente");
    }

    @Override
    public void nadar() {
        System.out.println("La tortuga nada");
    }

    @Override
    public void respirar() {
        System.out.println("La tortuga no respira agua");

    }
}
