package POO;

public abstract class Persona {

    //atributo
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(){

    }

    public void comer(){
        System.out.println("La persona come");
    }
    //metodo abstracto
    public abstract void trabajar();

}
