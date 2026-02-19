package POO;

public class Calculadora {
    //Atributos
    private String marca;
    private Double precio;

    public Calculadora(String marca, Double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    //Metodos
    public double sumar(double num1, double num2){
        return num1+num2;
    }

    public void sumar(){
        System.out.println("Estoy sumando");
    }

    public int sumar(int a, int b){
        return a+b;
    }

    public double sumar(double... nums){
        double sum=0;
        for(double num: nums){
            sum+=num;
        }
        return sum;
    }
}
