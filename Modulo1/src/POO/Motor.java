package POO;

public class Motor {
    private String marca;
    private String modelo;
    private Integer potencia;

    public Motor(String marca, String modelo, Integer potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
}
