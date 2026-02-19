package POO;

public class Pentagono implements Figura2D{
    private Double apotema;
    private Double lado;

    public Pentagono(Double apotema, Double lado) {
        this.apotema = apotema;
        this.lado = lado;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double areaFigura() {
        return 5*lado*apotema;
    }

    @Override
    public double perimetroFigura() {
        return 5*lado;
    }
}
