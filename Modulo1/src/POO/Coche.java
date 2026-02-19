package POO;

public class Coche {
    private String marca;
    private String color;
    private Double precio;
    private Motor motor;

    public Coche(String marca, String color, Double precio, Motor motor) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.motor = motor;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
