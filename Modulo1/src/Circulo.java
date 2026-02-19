public class Circulo implements Figura {
    int x,y,radio;
    public Circulo(int x, int y,int radio){
        this.x=x;
        this.y=y;
        this.radio=radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
}
