package POO;

public class Gato extends Animal{
    //Definiendo atributos de gato
    protected String color;


    //Metodo constructor, estamos inicializando los atributos
    public Gato(String color, String nombre, Integer edad, String raza){
        super(nombre,edad,raza);
        this.color=color;

    }


    public Gato() {
    }

    //Getter es para obtener los datos
    //Setter es para asignar un valor al atributo
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color= color;
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miauuu!!!");
    }

    @Override
    public void comer() {
        System.out.println("El gato come croquetas y alimento humedo");
    }

    public Integer envejecer(){
        ++edad;
        return edad;
    }
}
