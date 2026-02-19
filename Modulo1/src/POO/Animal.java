package POO;

public class Animal{
    //Atributos
    protected String nombre;
    protected Integer edad;
    protected String raza;
    //Metodo constructor con argumentos

    public Animal(String nombre, Integer edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    //Metodo constructor sin argumentos
    public Animal(){

     }



    //metodos generales que todos los animales hacen
  public void emitirSonido(){
      System.out.println("El animal emite sonido");
  }

  public void comer(){
      System.out.println("El animal come");
  }
}
