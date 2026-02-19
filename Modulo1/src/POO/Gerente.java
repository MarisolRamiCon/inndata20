package POO;

public class Gerente extends Persona{

    //metodo constructor
    public Gerente(String nombre){
        super(nombre);
    }

    @Override
    public void trabajar() {
        System.out.println("Soy gerente");
    }
}
