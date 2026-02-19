package POO;
//Heredar de la clase Thread
public class Proceso extends Thread {

    //atributo nombre
    private String nombre;
    //Metodo constructor
    public Proceso(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void run() {
        System.out.println("Hilo ejecutandose desde la clase Thread");
        for(int i=0; i<5;i++){
            System.out.println(nombre + "contador= "+ i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(nombre+ " se ha interrumpido");
            }
        }
        System.out.println("Hilo terminado");
    }
}
