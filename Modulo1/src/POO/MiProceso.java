package POO;

public class MiProceso implements Runnable{
    private String nombreProceso;

    public MiProceso(String nombreProceso){
        this.nombreProceso=nombreProceso;
    }

    @Override
    public void run() {
        System.out.println("Hilo ejecutandose desde la clase Thread");
        for (int i = 0; i < 5; i++) {
            System.out.println(nombreProceso + "contador= " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(nombreProceso + " se ha interrumpido");
            }
        }
        System.out.println("Hilo terminado");
    }
}
