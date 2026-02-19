package POO;

public class Paleta {
    private String tipo;
    private String sabor;

    public Paleta(String tipo, String sabor) {
        this.tipo = tipo;
        this.sabor = sabor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
