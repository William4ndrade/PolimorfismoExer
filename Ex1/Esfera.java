package Ex1;

public class Esfera extends FormaTridimensional{

    private double r;

    public Esfera(double r) {
        this.r = r;
    }

    @Override
    public double ObterArea() {
        return 4*Math.PI*Math.pow(r, 2);
    }

    @Override
    public double ObterVolume() {
        return (4/3)* Math.PI * Math.pow(r,3);
    }
}
