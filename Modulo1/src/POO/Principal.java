package POO;

public class Principal {
    public static void main(String[] args) {
        //Instanciamos a la clase Gato
        Gato gato= new Gato("naranja","Chispas",3,"mestizo");
        System.out.println("El gato tendra en un año "+gato.envejecer()+" años");
        System.out.println(gato.edad);
        gato.emitirSonido();
        gato.comer();

        //Polimorfismo
        Calculadora miCalculadora= new Calculadora("Casio",300.0);
        miCalculadora.sumar();
        System.out.println(miCalculadora.sumar(8.5,6.3,7.8,9.0));
        System.out.println(miCalculadora.sumar(8.9,3.5));
        System.out.println(miCalculadora.sumar(1,3));

        //Abstraccion
        Gerente gerente= new Gerente("Gerardo");
        gerente.comer();

        //Clases genericas
        Bolsa<Paleta> bolsaDePaletas= new Bolsa<>();
        bolsaDePaletas.anhadir(new Paleta("hielo","fresa"));
        bolsaDePaletas.anhadir(new Paleta("dulce","chile"));
        bolsaDePaletas.anhadir(new Paleta("hielo","chocolate"));
        System.out.println(bolsaDePaletas.getLista().stream().map(
                paleta -> {
                    return "Sabor= "+paleta.getSabor() +
                            "  Tipo de paleta= "+ paleta.getTipo();
                }
        ).toList());

        Bolsa<Soda> bolsaDeSodas= new Bolsa<>();
        bolsaDeSodas.anhadir(new Soda("Soda 1","fresa"));
        bolsaDeSodas.anhadir(new Soda("Soda 2","limón"));
        bolsaDeSodas.anhadir(new Soda("Soda 3","horchata"));
        System.out.println(bolsaDeSodas.getLista().stream().map(
                soda-> {
                    return "Nombre= "+soda.getNombre() +
                            "  Sabor= "+ soda.getSabor();
                }
        ).toList());

        //Implementar la clase compuesta
        Motor miMotor= new Motor("Marca1","s740",8);
        Coche miCoche= new Coche("Volswagen", "rojo",200000.0,miMotor);

        System.out.println("Mi coche tiene "+miCoche.getMotor().getPotencia() + " hp");

        //Instanciar la clase proceso
        Proceso miProceso= new Proceso("hilo 1");
        Proceso miProceso2= new Proceso("hilo 2");
        miProceso.start();
        miProceso2.start();

        //Cuando creamos hilos instanciando la Interfaz Runnable
        MiProceso tarea1 = new MiProceso("Hilo - 1 ");
        MiProceso tarea2= new MiProceso("hilo - 2");

        //Crear objetos Thread
        Thread hilo1= new Thread(tarea1);
        Thread hilo2= new Thread(tarea2);

        //Iniciar los hilos
        hilo1.start();
        hilo2.start();

        System.out.println("Hilos principales lanzados");
    }
}
